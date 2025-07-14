package superKeyword;

public class Child21 extends Parent2 {
	public void display() {
		System.out.println("Immediate Child class");
	}
	public void displayy() {
		display();
		super.display();
	}

	public static void main(String[] args) {
		Child21 c=new Child21();
		c.displayy();
	}

}
