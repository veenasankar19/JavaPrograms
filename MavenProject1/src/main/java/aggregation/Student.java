package aggregation;

public class Student {
	int age;
	String name;
	
	School obj;  //This is called aggregation. School is the other class called from Student.
	
	Student(int age, String name, School obj){ //Student is constructor
	this.age=age;
	this.name=name;
	this.obj=obj;
}
public void displayy() {
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	System.out.println("School is ");
	obj.display();
}

	public static void main(String[] args) {
		School sc = new School (2,4);
		Student st= new Student(12, "veena", sc);
		
		st.displayy();
		

	}

}
