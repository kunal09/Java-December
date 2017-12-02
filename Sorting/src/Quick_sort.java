
public class Quick_sort {

	private static int[] A;		//the array
	private static int n;		//size of the array
	
	public static int partition(int start, int end) {
		int pindex=start;
		//taking the last value as pivot
		int t,pivot=end-1;
		for(int i=start;i<end;i++) {
			if(A[i]<A[pivot]) {
				t=A[i];
				A[i]=A[pindex];
				A[pindex]=t;
				pindex++;
			}
		}
		t=A[pivot];
		A[pivot]=A[pindex];
		A[pindex]=t;
		return pindex;
	}
	
	public static void Quick_Sort(int start, int end) {
		if(start<end) {
			int pivot=partition(start,end);
			Quick_Sort(start,pivot);
			Quick_Sort(pivot+1,end);	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Performing Quick sort in ascending order
		 * @param A is the array to be sorted
		 * @param n is the size of the array
		 */
		int b[]= {6,7,5,3,2,8,4,9};
		A=b.clone();
		n=8;
		/*
		 * the basics of quick sort is to pick a pivot and move all the elements
		 * shorter one side and higher the other side
		 */
		Quick_Sort(0,n);
		for(int i=0;i<n;i++)
			System.out.print(A[i]);
	}
}

