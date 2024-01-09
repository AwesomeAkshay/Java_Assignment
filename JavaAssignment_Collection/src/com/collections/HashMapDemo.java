package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to add elements to the HashMap given the key and value data type is String
		Map<String, String> hm = new HashMap();
		hm.put("CI12329", "Akshay");
		hm.put("CI12328", "Aniket");
		hm.put("CI123230", "Pavan");
		hm.put("CI12329", "Awesome");
		
		Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
