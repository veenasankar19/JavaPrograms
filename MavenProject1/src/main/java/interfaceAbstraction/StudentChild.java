package interfaceAbstraction;

public class StudentChild implements StudentParent {
public void display()
{
	System.out.println("Interface Child");
	}

	public static void main(String[] args) {
		StudentChild sc = new StudentChild();
		sc.display();

	}

}
