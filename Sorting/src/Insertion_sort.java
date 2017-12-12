
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Performing Insertion sort in ascending order
		 * @param a is the array to be sorted
		 */
		int a[]= {9,5,6,9,3,0,1,3,5,7,8,5,9,6,2,3,7};
		/*
		 * the basics of insertion sort is to sort the array as
		 * you keep on accessing further elements
		 */
		if(a!=null) {
			double start_time=System.nanoTime();		//marking the start time
			Insertion_sort(a);							//performing the function
			double end_time=System.nanoTime();
			double running_time=(end_time-start_time)/(1.0E9);	//total runtime
			System.out.println("It took a total running time of "+running_time+" seconds");
		}
			
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
	
	static int[] Insertion_sort(int[] input) {
		for(int i=1;i<input.length;i++) {
			int temp=input[i];			
			int pos=i;
			for(int j=i-1;j>=0;j--) {
				if(input[j]>temp){
					pos=j;
					input[pos+1]=input[pos];
				}
			}
			input[pos]=temp;
		}
		return input;
	}
}
