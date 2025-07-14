package hierarchical;

public class Dog extends Animals {
	public void displayd()
	{
		System.out.println("Dog here.!");
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.displayd();
		d.display();
		Cat c=new Cat();
		c.displayc();
		c.display();
	}

}
