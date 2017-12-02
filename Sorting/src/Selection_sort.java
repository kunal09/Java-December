
public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Performing Selection sort in ascending order
		 * @param A is the array to be sorted
		 * @param n is the size of the array
		 */
		int A[]= {9,6,7,3,1,6,8};
		int n=7;
		/*
		 * the basics of selection sort is to find the minimum value and put it at start
		 */
		int i,j,t;
		for(i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				if(A[j]<A[i]) {
					t=A[j];
					A[j]=A[i];
					A[i]=t;
				}
				
			}
		}
		for(i=0;i<n;i++)
			System.out.print(A[i]);
	}
}
