package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {
		Set <String> s1 = new HashSet<String>();
		Set <String> s2 = new TreeSet<String>();
		s1.add("Mango");
		s1.add("Grapes");
		s1.add("Apple");
		s1.add("Watermelon");
		s1.add("Orange");
		s1.add("Avocado");
		s1.add("Pineapple");
		s2.add("Dates");
		System.out.println(s1);
		
		s2.addAll(s1); //s1 is added to s2 which is not in same order
		System.out.println(s2);
		System.out.println(s1.size()); //size of s1
		System.out.println(s2.isEmpty()); //find elements inside s2
		System.out.println(s2.contains("Avocado"));
		System.out.println(s2.contains("Fig"));
		System.out.println(s1.containsAll(s2));
		System.out.println(s2.containsAll(s1));
		
		s1.remove("Pineapple"); //remove element from s1
		System.out.println(s1);
		System.out.println(s2);
		s2.removeAll(s1); //remove s1 from s2
		System.out.println(s2);
		
		s1.clear();
		System.out.println(s1);

	}

}
