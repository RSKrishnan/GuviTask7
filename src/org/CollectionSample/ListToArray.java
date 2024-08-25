package org.CollectionSample;

import java.util.LinkedList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		//List is index based
		//LinkedList is a class of List Interface
		//We can store dis-similar datatypes 
		List<String> linkedList = new LinkedList<>();
		//values had been added using add method in linkedList
		linkedList.add("Green");
		linkedList.add("Blue");
		linkedList.add("White");
		linkedList.add("Yellow");
		linkedList.add("Red");
		
		System.out.print("List :- ");
		System.out.println(linkedList);
		//size of the linkedList is calculated
		int size = linkedList.size();
		//size of the array is calculated
		String[] arr = new String[size];
		//for loop and get method to retrieve the value and store it to array variable
		for(int i=0;i<size;i++)	
		{
			arr[i] = linkedList.get(i);		
		}
		System.out.print("Array :- ");
		//for each method is used to traverse the array and print the values in array
		for(String clr :arr)
		{
			System.out.print(" "+clr);
		}
		
	}

}
