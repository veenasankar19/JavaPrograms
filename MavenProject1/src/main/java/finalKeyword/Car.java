package finalKeyword;

public class Car {
	final String color="Blue";
	//color="Yellow"; //final variable cannot be re initialised
	
	public void display()
	{
		//color="Red"; //final variable cannot be re initialised
		System.out.println(color);
	}
	public static void main(String args []) {
		Car obj=new Car();
		obj.display();
	}

}
