package multi_inheritance;

public class Puppy extends Dog {
	public void displayyy()
	{
		System.out.println("Puppy here");
	}

	public static void main(String[] args) {
		Puppy obj = new Puppy();
		obj.display();
		obj.displayy();
		obj.displayyy();
	}

}
