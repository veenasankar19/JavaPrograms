package collection;

import java.util.ArrayList;
import java.util.List;

public class IteratorSample2 {

	public static void main(String[] args) {
		List <String> l = new ArrayList<String>();
		l.add("Red");
		l.add("Blue");
		l.add("Green");
		l.add("Yellow");
		System.out.println(l);
		
		for(String s:l) {    //s is variable
			System.out.println(s);
		}

	}

}
