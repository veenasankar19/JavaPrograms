package exceptionHandling;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int num=10;
		float result = num/0;
		System.out.println("The value "+num+"when divided by 0 gives "+result);
		}
		catch(ArithmeticException e) {     //here any variable can be used instead of e
			System.out.println("The exception is "+e);  // catch block will execute only if try catch is there. Both exists together.
		}                                               //we can use multiple catch with SINGLE try block
		finally {                                       //finally also executes only if try block is there, but to handle exception we need to give catch block.
			System.out.println("This will work when catch block is absent");
		}

	}

}
