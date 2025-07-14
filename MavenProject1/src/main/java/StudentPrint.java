import encapsulation.Student;

public class StudentPrint {

	public static void main(String[] args) {
		Student s=new Student();
		s.setMethod1(44);
		s.setMethod2("Obsqura");
		System.out.println(s.getMethod1());
		System.out.println(s.getMethod2());

	}

}
