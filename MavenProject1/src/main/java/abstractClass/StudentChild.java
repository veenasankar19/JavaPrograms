package abstractClass;

public class StudentChild extends StudentParent {
	public void print()    //method overriding
	{
		System.out.println("Abstract method child class");
	}


	public static void main(String[] args) {
		StudentChild sc= new StudentChild();
		sc.display();
		sc.print();
	}

}
