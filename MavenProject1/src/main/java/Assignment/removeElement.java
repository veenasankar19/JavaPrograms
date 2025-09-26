package Assignment;

import java.util.ArrayList;
import java.util.List;

public class removeElement {

	public static void main(String[] args) {
		List <String> l = new ArrayList <String>();
		l.add("Rose");
		l.add("Jasmine");
		l.add("Lilly");
		
		System.out.println("Full ArrayList");
		System.out.println(l);
		System.out.println("After Removing");
		l.remove(2);
		System.out.println(l);
	}
}
