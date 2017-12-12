
public class Bubble_sort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Performing Bubble sort in ascending order
		 * @param a is the array to be sorted 
		 */
		int a[]= {9,5,6,9,3,0,1,3,5,7,8,5,9,6,2,3,7};
		
		/*
		 * the basic functionality of bubble sort is that it kind of takes a scan
		 * through all the array elements and take the maximum element to the last
		 */
		//using nanoTime instead of currentTimeMillis as have more precision here
		if(a!=null) {
			double start_time=System.nanoTime();		//marking the start time
			Bubble_sort(a);							//performing the function
			double end_time=System.nanoTime();
			double running_time=(end_time-start_time)/(1.0E9);	//total runtime
			System.out.println("It took a total running time of "+running_time+" seconds");
		}		
		
		for(int i=0;i<a.length;i++)						//printing the array
			System.out.print(a[i]);
	}
	
	/*
	 * A WARNING has been displayed here as "This method has a Constructor name"
	 * Please advise how to resolve this
	 */
	static int[] Bubble_sort(int[] input) {
		//int n=input.length;					//length of the array
		for(int i=0;i<input.length;i++)
		{								
			int pos=0;			//setting the first element as the Max element
			int max=input[pos];
			for(int j=0;j<input.length-i;j++)
			{					//traversing the array to find the max element
				if(input[j]>max)
				{
					pos=j;
					max=input[pos];
				}
			}
						//swapping the Max element with input.length-i-1 position
			input[pos]=input[input.length-i-1];
			input[input.length-i-1]=max;
		}
		return input;
	}
}
