package polymorphism;

public class RunTimeChild extends RunTimeParent{
	public void display(String name, int age) //method overriding - method name and parameters should same for parent and child classes. Only printing statement can change.
	{
		System.out.println("Run Time Polymorphism of Child Class");
		System.out.println("Name="+name+" Age="+age);
	}

	public static void main(String[] args) {
		RunTimeChild c=new RunTimeChild(); //calling child class method
		c.display("Veena", 20);
		
		RunTimeParent p=new RunTimeChild(); //calling child class method LHS is parent which is bigger than child which is small. Cannot set like RunTimeChild c=new RunTimeParent.
		p.display("Anjana",25);
                                             //Use super keyword to get parent class details
	}

}
