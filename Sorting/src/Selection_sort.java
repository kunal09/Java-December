
public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Performing Selection sort in ascending order
		 * @param a is the array to be sorted
		 */
		int a[]= {9,5,6,9,3,0,1,3,5,7,8,5,9,6,2,3,7,3,1,6,8};
		/*
		 * the basics of selection sort is to find the minimum value and put it at start
		 */
		if(a!=null) {
			double start_time=System.nanoTime();		//marking the start time
			Selection_sort(a);							//performing the function
			double end_time=System.nanoTime();
			double running_time=(end_time-start_time)/(1.0E9);	//total runtime
			System.out.println("It took a total running time of "+running_time+" seconds");
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
	
	static int[] Selection_sort(int[] input) {
		for(int i=0;i<input.length;i++) {
			for(int j=i;j<input.length;j++) {
				if(input[j]<input[i]) {
					int temp;				//declaring the temporary function
					//swapping the minimum element with the start of counter i
					temp=input[j];
					input[j]=input[i];
					input[i]=temp;
				}
			}
		}
		return input;
	}
}
