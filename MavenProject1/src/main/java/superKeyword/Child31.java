package superKeyword;

public class Child31 extends Parent3 {
	Child31()
	{
		super(5,8); //super keyword calls the constructor of parent class
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		Child31 c= new Child31();

	}

}
