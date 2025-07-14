package defaultAccessModifier;

public class ParentClass {
	void display() {
		System.out.println("Example of default Access Modifier");
	}

	public static void main(String[] args) {
		ParentClass p=new ParentClass();
		p.display();

	}

}
