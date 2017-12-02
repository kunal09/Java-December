
public class Automated_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This function is used to check whether or not the sorted array
		 * is indeed in an ascending order
		 */
		int i,j,flag=0;
		int A[] = {5,4,9,8,4,3,2,7};
		int n=A.length;	//size of the array
		/*
		 * let there be some function call here which returns the sorted array 
		 * and let that array be B and it be sorted in ascending order
		 */
		int[] B= {2,3,4,5,4,7,8,9};	//sorted array
		int nB=B.length;
		//the sizes of the two arrays are equal
		if(n!=nB)	
			flag=1;
		else {
			//the contents in the two array are the same
			int flag2=0;
			for(i=0;i<n;i++) {
				flag2=0;
				for(j=0;j<n;j++) {
					if(A[i]==B[j])
						flag2=1;
				}
				if(flag2==0) {
					flag=1;
					break;
				}
			}
		}
		if(flag==0){
			//the array is in ascending order
			for(i=0;i<n-1;i++) {
				if(B[i]>B[i+1])
					flag=1;
			}
		}
		if(flag==0)
			System.out.println("The sorting algorithm is fool proof");
		else
			System.out.println("There is some error in your sorting algorithm");
	}
}
