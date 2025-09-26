package finalReview;

public class Class implements Interface1, Interface2 {
	public void method1() {
		System.out.println("Method 1 in Interface 1");
	}
	public void method2() {
			System.out.println("Method 1 in Interface 2");
		}
	public void method3(int age) {
		System.out.println("Method 1 in Child");
		System.out.println("Age is "+age);
	}

	public static void main(String[] args) {
		Class c=new Class();
		c.method1();
		c.method2();
		c.method3(10);
	}

}
