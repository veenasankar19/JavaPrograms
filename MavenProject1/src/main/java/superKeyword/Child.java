package superKeyword;

public class Child extends Parent{

	int age=5;
	public void display()
	{
		System.out.println("Age of child class: "+age);
		System.out.println("Age of parent class: "+super.age);
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.display();

	}

}
