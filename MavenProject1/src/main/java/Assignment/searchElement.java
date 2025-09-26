package Assignment;

import java.util.ArrayList;
import java.util.List;

public class searchElement {

	public static void main(String[] args) {
		List <String> l = new ArrayList <String>();
		l.add("Grapes");
		l.add("Watermelon");
		l.add("Orange");
		
		System.out.println(l.contains("Watermelon")); //available in list
		System.out.println(l.contains("Apple"));      //not available in list
	}
}
