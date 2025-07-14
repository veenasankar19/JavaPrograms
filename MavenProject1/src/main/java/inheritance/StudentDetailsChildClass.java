package inheritance;

public class StudentDetailsChildClass extends StudentDetails{
	public void classdetails()
	{
		System.out.println("Study in Grade 2");
	}

	public static void main(String[] args) {
		StudentDetailsChildClass obj = new StudentDetailsChildClass();
		obj.display();
		obj.classdetails();

	}

}
