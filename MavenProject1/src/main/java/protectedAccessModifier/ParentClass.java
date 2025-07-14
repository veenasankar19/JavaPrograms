package protectedAccessModifier;

public class ParentClass {
protected void display() {
	System.out.println("An example of protected access modifier");
}
	public static void main(String[] args) {
		ParentClass p=new ParentClass();
		p.display();

	}

}
