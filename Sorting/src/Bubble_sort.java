
public class Bubble_sort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Performing Bubble sort in ascending order
		 * @param A is the array to be sorted 
		 * @param n is the size of the array
		 */
		int A[]= {5,9,3,7,2,1,5};
		int n=7;
		/*
		 * the basic functionality of bubble sort is that it kind of takes a scan
		 * through all the array elements and take the maximum element to the last
		 */
		int i,j,max,pos;
		for(i=0;i<n;i++)
		{
			max=A[0];
			pos=0;
			for(j=0;j<n-i;j++)
			{
				if(A[j]>max)
				{
					max=A[j];
					pos=j;
				}
			}
			//System.out.print(max);
			A[pos]=A[n-i-1];
			A[n-i-1]=max;
		}
		for(i=0;i<n;i++)
			System.out.print(A[i]);
	}

}
