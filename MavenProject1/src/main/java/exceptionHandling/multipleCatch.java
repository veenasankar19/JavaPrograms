package exceptionHandling;

public class multipleCatch {

	public static void main(String[] args) {
		try {
			int a[]=new int[4];
			//a[5]=10/0;                //the first catch block where exception first occurs will be executed if there are multiple catch blocks.
			System.out.println(a[6]);
			System.out.println("Testing"); //this statement will not get executed since already an exception occurred above
		}
		catch(ArithmeticException e) {
			System.out.println("First catch block");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Second catch block");
			System.out.println(a);
		}
		}

	}


