package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSample {

	public static void main(String[] args) {
		List <String> l= new ArrayList<String>();
		l.add("Rose");
		l.add("Jasmine");
		l.add("Lilly");
		System.out.println(l);
		
		Iterator <String> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(l);

	}

}
