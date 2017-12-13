package lists;

public class set_using_list {

	//checking if the list is a set or not
	static boolean check(int[] input) {
		//performing by checking if any element has more than one occurrence
		for(int i=0;i<input.length-1;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]==input[j])			//A match has occurred, there are atleast 2 occurrences found
					return false;				//this list cannot be a set
			}
		}
		return true;
	}
	
	//adding an element to the set input
	static int[] add(int[] input, int element) {
		boolean found=false;						//if element is found, we dont have to add it
		for(int i=0;i<input.length;i++)
			if(input[i]==element) {
				found=true;							//element is found, cannot add another instance
				break;
			}
		
		if(found==false) {
			//this is kind of like an append function, making an assumption
			input[input.length]=element;
		}
		else
			System.out.println("The set already contains the element "+element);
		return input;
	}

	//removing element from set
	static int[] remove(int[] input, int element) {
		boolean found=false;						//if element is found, we dont have to add it
		int i;							//i takes note of the position of the element to be removed
		for(i=0;i<input.length;i++)
			if(input[i]==element) {
				found=true;							//element is found, deletion can be done
				break;
			}
		
		if(found==true) {
			for(int k=i;k<input.length-2;k++)
				input[k]=input[k+1];
			input[input.length-1]=-1;
			System.out.println("The element "+element+" has been removed");
			/*
			 * MAKING THE ASSUMPTION OF REMOVING THE LENGTH BY MAKING IT -1
			 * DON'T KNOW EXACTLY HOW TO MODIFY THE SIZE OF THE ARRAY
			 * NEED HELP AT THIS POINT
			 */
		}
		else
			System.out.println("The set does not contains the element "+element);
		return input;
	}
	
	//printing the set
	static void print(int[] input) {
		for(int i=0;i<input.length;i++)
			if(input[i]!=-1)				//as post removing the elements putting -1 at the last
				System.out.print(input[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set= {1,2,3,4,5,6,7,8,9};

		//addition of an element to set
		int add_element=7;
		add(set, add_element);
		
		//removal of an element from set
		int remove_element=9;
		if(set!=null)
			remove(set,remove_element);
		
		//check if the given list is a set or not
		if(check(set)==true)
			System.out.println("The given list is a set");
		else
			System.out.println("The given list is not a set");
		
		//print the set
		print(set);
	}
}
