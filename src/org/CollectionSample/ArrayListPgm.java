package org.CollectionSample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPgm {

	public static void main(String[] args) {
		//ArrayList comes under List Interface
		//List is index based
		//List follows insertion order
		//Arraylist is created for String datatype
		List<String> a = new ArrayList<String>();
		//It allow duplicate element
		//We can store dis-similar data type
		a.add("Mango");
		a.add("Orange");
		a.add("Grapes");
		a.add("Mango");
		a.add("Orange");
		a.add("Apple");
		//Array list is printed 
		System.out.print("Array List :- ");
		System.out.println(a);
		//Using isEmpty method used to check whether the arraylist is empty or not
		boolean empty = a.isEmpty();
		System.out.println("Whether the arraylist is empty : "+empty);
		//removeAll method is used to removal all the element from arraylist
		a.removeAll(a);
		System.out.println("Array list after using removeAll() method :- "+a);
		//Using isEmpty method used to check whether the arraylist is empty or not
		boolean empty1 = a.isEmpty();
		System.out.println("Whether the arraylist is empty : "+empty1);
		
		
	}

}
