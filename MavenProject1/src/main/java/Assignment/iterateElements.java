package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterateElements {
	public static void main(String[] args) {
		List <String> i = new ArrayList <String>();
		i.add("Trivandrum");
		i.add("Kollam");
		i.add("Kottayam");
		i.add("Kochi");		
		/*for (String s:i) {
			System.out.println(s);
		} */
		Iterator <String> s= i.iterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}		
	}
}
