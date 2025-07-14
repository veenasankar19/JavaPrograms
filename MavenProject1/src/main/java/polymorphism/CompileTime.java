package polymorphism;

public class CompileTime {
	public void display(int a, int b)
	{
		System.out.println("Compile Time Polymorphism method 1");
		System.out.println("a="+a+" b="+b);
	}
	public void display(String name)
	{
		System.out.println("Compile Time Polymorphism method 2");
		System.out.println("Name="+name);
	}
	public void display()
	{
		System.out.println("Compile Time Polymorphism method 3");
	}

	public static void main(String[] args) {
		CompileTime c = new CompileTime();
		c.display(10,15);
		c.display();
		c.display("Veena");

	}

}
