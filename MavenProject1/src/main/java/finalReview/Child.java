package finalReview;

public class Child implements Parent1, Parent2 {
	public void display1() {
		System.out.println("Parent1");
	}
	public void display2() {
		System.out.println("Parent2");
	}
	public void display3(String name) {
		System.out.println("Child");
		System.out.println("Name is "+name);
	}

	public static void main(String[] args) {
		Child c= new Child();
		c.display1();
		c.display2();
		c.display3("Veena");
	}

}
