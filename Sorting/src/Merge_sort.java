
public class Merge_sort {

	private static int[] A;		//the array
	private static int n;		//size of the array

	public static void Merge_Sort(int start, int end) {
		if(end-start>1) {
			Merge_Sort(start,(start+end)/2);
			Merge_Sort((start+end)/2,end);
			int i,j,k;
			int[] B=A.clone();
			int s1, s2, e1, e2;
			s1=start;
			s2=(start+end)/2;
			e1=(start+end)/2-1;
			e2=end-1;
			i=s1;
			j=s2;
			k=s1;
			while(i<=e1 && j<=e2) {
				if(A[i]<A[j])
					B[k++]=A[i++];
				else
					B[k++]=A[j++];
			}
			if(i>e1) {
				while(j<=e2)
					B[k++]=A[j++];
			}
			if(j>e2) {
				while(i<=e1)
					B[k++]=A[i++];
			}
			A=B.clone();		
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
		 * the basics of merge sort is simple 
		 * just go through both the arrays and add the shortest one to the third array
		 */
		Merge_Sort(0,n);
		for(int i=0;i<n;i++)
			System.out.print(A[i]);
	}
}
