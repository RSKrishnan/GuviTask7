package org.CollectionSample;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPgm {

	public static void main(String[] args) {
		//Map will be in key, pair combination
		//Key does not allows to have duplicate 
		//Values can be duplicate
		//TreeMap will be in ascending order
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Bala",45);
		treeMap.put("Arun",5);
		treeMap.put("Dharun",7);
		treeMap.put("Govind",78);
		//treemap is convert to entrySet
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		//for each loop is used to print the values using entry set() method
		for(Entry<String, Integer> e: entrySet)
		{
			System.out.println(e);
		}
	}

}
