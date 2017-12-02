
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=new Object();
		float i=1;
		if(o!=null) {
			if(i!=0)
				System.out.println("testing boolean");
		}
		System.out.println("Hello world!");
		
		Float f = new Float(4.0);
		Integer i1 = new Integer(3);
		
		Object o1 = f;
		printType(f);
		printType(i1);
		
	}

	/**
	 * this method will test the type of the passed in parameter
	 * and print the data type 
	 * @param o
	 * 
	 */
	public static void printType(Object o)
	{
		if (o instanceof Float)
		{
			System.out.println(" Object is a Float - " + (Float)o);
		}
		else if (o instanceof Integer)
		{
			System.out.println(" Object is a Integer - " + (Integer)o);
		}

		
	}
}
