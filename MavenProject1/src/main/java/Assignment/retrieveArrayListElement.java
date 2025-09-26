package Assignment;

import java.util.ArrayList;
import java.util.List;

public class retrieveArrayListElement {

	public static void main(String[] args) {
		List <String> l= new ArrayList <String>();
		l.add("Car");
		l.add("Bus");
		l.add("Auto");
		l.add("Bike");
		
		System.out.println(l.get(2)); //get the element at index 2

	}

}
