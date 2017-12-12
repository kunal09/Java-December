
public class Merge_sort {

	//basic swap function performing swap between element1 and element2
	static int[] swap(int[] input, int element1, int element2) {
		int temp;
		temp=input[element1];
		input[element1]=input[element2];
		input[element2]=temp;
		return input;
	}
	
	public static int[] Merge_Sort(int[] input, int start, int end) {
		if(end-start>1) {
			int mid_index=(start+end)/2;
			
			//sorting both the sub arrays
			Merge_Sort(input, start,mid_index);
			Merge_Sort(input, mid_index,end);
			int count_i;	//to keep in check how long does i needs to run
			int iterations=mid_index-start;	//upper bound count_i can reach
			count_i=0;
			int i,j,pindex;
			i=start;
			pindex=start;		//pindex is the index before which the final array is sorted
			for(j=mid_index;count_i<iterations&&j<end;) {
/*				for(int k=0;k<input.length;k++)
					System.out.print(input[k]);
				System.out.print(" "+input[i]+" to "+input[mid_index-1]+" and "+input[j]+" to "+input[end-1]+"   ");
*/				if(input[i]<=input[j]) {
							//first array comes in place if smaller
					swap(input,i++,pindex++);
					count_i++;
				}
				else {
					int temp=input[j];
					/*
					 * array from second half is smaller here
					 * so, shifting all the current elements by one to add
					 * the smaller element at the start of the array
					 */
					for(int k=j;k>i;k--) {
						input[k]=input[k-1];
					}
					input[pindex]=temp;	
					i++;				//incrementing i as the complete array is moved forward by 1
					j++;
					pindex++;
				}
			} 
			//one of the arrays has been completely utilized
			//the first half has completely been added to the final array
			if(count_i==iterations) {
				while(j<end)
					input[pindex++]=input[j++];
			}
			//the second array has finished first
			if(j==end) {
				while(count_i<iterations&&i<end)
					input[pindex++]=input[i++];
			}
			/*	used during debugging
			    for(int k=0;k<input.length;k++)
					System.out.print(input[k]);
				System.out.println();
			*/
		}
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Performing Quick sort in ascending order
		 * @param a is the array to be sorted
		 */
		int a[]= {6,7,9,8,6,5,6,9,3,0,1,3,5,7,8,5,9,6,2,3,7,5,3,2,1,0};
		/*
		 * the basics of merge sort is based on standard merge+simple
		 * here we just need to do it recursively to get the sorted array 
		 * just go through both the arrays and add the shortest one to the third array
		 * working on doing the sorting in array
		 */
		if(a!=null) {
			double start_time=System.nanoTime();		//marking the start time
			Merge_Sort(a,0,a.length);					//performing the function
			double end_time=System.nanoTime();
			double running_time=(end_time-start_time)/(1.0E9);	//total runtime
			System.out.println("It took a total running time of "+running_time+" seconds");
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
}
