package collection;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List <String> l = new ArrayList<String>();
		
		l.add("red");
		l.add("blue");
		l.add("green");
		l.add("yellow");
		System.out.println(l); // output is [red, blue, green, yellow]
		
		System.out.println(l.get(2)); //get
		
		l.set(3, "Pink");             //set
		System.out.println(l);
		
		System.out.println(l.size());
		
		System.out.println(l.isEmpty());
		
		l.remove(1);   //removed Blue
		System.out.println(l);
		
		System.out.println(l.contains("Black")); //false since absent
		System.out.println(l.contains("Pink"));  //true
		
		l.add("Pink");
		System.out.println(l.indexOf("Pink"));
		System.out.println(l);
		System.out.println(l.lastIndexOf("Pink"));

	}

}
