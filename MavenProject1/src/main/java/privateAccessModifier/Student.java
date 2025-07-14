package privateAccessModifier;

public class Student {
	private void display()
	{
		System.out.println("This is an example of priate access modifier where I am inside private class.");
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.display();

	}

}
