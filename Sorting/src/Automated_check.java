
public class Automated_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This function is used to check whether or not the sorted array
		 * is indeed in an ascending order
		 */
		boolean result=true;		//result is TRUE means there is no error so far
		int input[] = {5,4,9,8,4,3,2,7};
		//if input is NULL itself then the function itself will not sort it
		/*
		 * let there be some function call here which returns the sorted array 
		 * and let that array be output and it be sorted in ascending order
		 */
		int[] output= {2,3,4,4,5,7,8,9};			//sorted array
			//1. the sizes of the two arrays should equal
		if(input.length!=output.length)	
			result=false;
		else {
			//2. the contents in the two array should be same
			for(int i=0;i<input.length;i++) {
				boolean occurrence=false;				//to see if each element of input is present in output
														//currently there is no occurrence for i th element
				for(int j=0;j<input.length;j++) {
					if(input[i]==output[j])
						occurrence=true;				//the occurrence has taken place
				}
				if(occurrence==false) {					//no occurrence means there is some problem
					result=false;
					break;
				}
			}
		}
		if(result==true){
			//3. the array should be in ascending order
			for(int i=0;i<input.length-1;i++) {
				if(output[i]>output[i+1])
					result=false;
			}
		}
		if(result==true)
			System.out.println("The sorting algorithm is fool proof");
		else
			System.out.println("There is some error in your sorting algorithm");
	}
}
