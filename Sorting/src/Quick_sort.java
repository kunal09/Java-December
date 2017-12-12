
public class Quick_sort {

	/*
	 * NOTE
	 * NOT VERY SURE ON HOW TO USE ARRAY AS A PARAMETER IN A FUNCTION
	 * PLEASE CLEAR THAT DOUBT
	 * 
	 * ALSO DON'T KNOW ABOUT THE USE OF STATIC, tried learning it but not clear 
	 * PLEASE CLEAR THAT AS WELL
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Performing Quick sort in ascending order
		 * @param a is the array to be sorted
		 */
		int a[]= {9,5,6,9,5,1,3,3,0,2,3,7,3,1,6,8};
		/*
		 * the basics of quick sort is to pick a pivot and move all the elements
		 * shorter one side and higher the other side
		 */
		if(a!=null) {
			double start_time=System.nanoTime();		//marking the start time
			Quick_sort(a,0,a.length);							//performing the function
			double end_time=System.nanoTime();
			double running_time=(end_time-start_time)/(1.0E9);	//total runtime
			System.out.println("It took a total running time of "+running_time+" seconds");
		}
			
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
	
	public static int partition(int[] input, int start, int end) {
		//maintaining an index which acts as pivot
		int pindex=start;
		//taking the last value as pivot
		int pivot=end-1;
		for(int i=start;i<end;i++) {
			//			for(int k=0;k<input.length;k++)
			//				System.out.print(input[k]);
			//			System.out.println(" pivot is "+input[pivot]);
			if(input[i]<input[pivot]) {
				//moving all the elements<pivot to the left side
				swap(input,i,pindex);
				pindex++;			//incrementing the pivot as the swap has been made
			}
		}
		swap(input,pivot,pindex);
		return pindex;
	}
	
	//basic swap function performing swap between element1 and element2
	static int[] swap(int[] input, int element1, int element2) {
		int temp;
		temp=input[element1];
		input[element1]=input[element2];
		input[element2]=temp;
		return input;
	}
	
	/*
	 * start and end are parameters between which the
	 * QuickSort algorithm needs to be implemented
	 */
	
	public static int[] Quick_sort(int[] input, int start, int end) {
		if(start<end) {
			//taking the last element as a pivot and doing partitioning
			int pivot=partition(input,start,end);
			Quick_sort(input,start,pivot);
			Quick_sort(input,pivot+1,end);	
		}
		return input;
	}
	
}

