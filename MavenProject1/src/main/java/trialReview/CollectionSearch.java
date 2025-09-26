package trialReview;

import java.util.ArrayList;
import java.util.List;

public class CollectionSearch {

	public static void main(String[] args) {
		List <String> l=new ArrayList <String>();
		l.add("Blue");
		l.add("Red");
		l.add("Green");
		
		System.out.println(l.get(2));            //to get element at index 2
		System.out.println(l.contains("Pink"));  //to check whether element Pink is present or not

	}

}
