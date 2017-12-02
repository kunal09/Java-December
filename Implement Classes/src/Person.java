import java.util.Console;

public class Person {

	public class Name{
		String FirstName;
		String LastName;
		private void EnterName() {
			System.out.println("Enter your first name");
			console scan = System.console();
			FirstName=scan.readLine();
			System.out.println("Enter your last name");
			LastName=scan.readLine();
			scan.close();
		}
	}
	
	public class Address{
		String Line1;
		String Line2;
		String City;
		String State;
		int ZipCode;
		private void EnterAddress() {
			System.out.println("Enter Address:");
			console scan =System.console();
			System.out.println("Enter Line1");
			Line1=scan.readLine();
			System.out.println("Enter Line2");
			Line2=scan.readLine();
			System.out.println("Enter City");
			City=scan.readLine();
			System.out.println("Enter State");
			State=scan.readLine();
			System.out.println("Enter Zip Code");
			ZipCode=scan.readInt();
			scan.close();
		}
	}

	private Name name;
	private  Address addr;
	
	Person() {
		name.EnterName();
		addr.EnterAddress();
	}

	public static void main(String[] args) {
		Person p;
	}
	
}
