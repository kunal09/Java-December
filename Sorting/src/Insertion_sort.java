
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Performing Insertion sort in ascending order
		 * @param A is the array to be sorted
		 * @param n is the size of the array
		 */
		int A[]= {9,6,5,3,8,4,7};
		int n=7;
		/*
		 * the basics of insertion sort is to sort the array as
		 * you keep on accessing further elements
		 */
		int i,j,pos=0,temp;
		for(i=1;i<n;i++) {
			temp=A[i];
			for(j=i-1;j>=0;j--) {
				if(A[j]>temp){
					pos=j;
					A[j+1]=A[j];
				}
			}
			A[pos]=temp;
		}
		for(i=0;i<n;i++)
			System.out.print(A[i]);
	}
}
