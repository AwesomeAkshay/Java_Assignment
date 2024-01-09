package com.collections;

import java.util.TreeMap;

public class SearchingMap {
	
	public void searchKey(TreeMap tm,int key){
		boolean y = tm.containsKey(key);
		if (y) 
		{
			System.out.println("Value For the givane key: " + tm.get(1));
		}
		else
		{
			System.out.println("Key is not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to search for a key in a Tree Map.
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "Akshay");
		tm.put(2, "Dhruv");
		tm.put(3, "Aniket");
		tm.put(1, "Pavan");
		System.out.println("MAP: ");
		System.out.println(tm);
		System.out.println();
		
		SearchingMap sm = new SearchingMap();
		sm.searchKey(tm, 1);
	}

}


