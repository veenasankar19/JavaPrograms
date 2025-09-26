package trialReview;

public class MIChild implements MIParent1, MIParent2 {   
	/*class and interface are connected with keyword implements. 
	  class and class are connected by extends. 
	  3 interface cannot be clubbed. bcz we cannot create obj in interface. Hence we create child as class*/

	public void display1() {
		System.out.println("Multiple Inheritance method1");
	}
	
	public void display2() {
		System.out.println("Multiple Inheritance method2");
	}
	
	public void display3(String s) {
		System.out.println("Multiple Inheritance method3");
		System.out.println("String value is "+s);
	}
	
	public static void main(String[] args) {
		MIChild c=new MIChild();
		c.display1();
		c.display2();
		c.display3("Exam");
	}

}
