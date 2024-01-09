package com.collections;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to copy one array list into another.
		ArrayList<String> al = new ArrayList<>();
		al.add("Akshay");
		al.add("Aniket");
		al.add("Pavan");
		al.add("Akshay");
		
		ArrayList<String> alc = new ArrayList<>();
		alc.addAll(al);
		
		System.out.println("Copied array-");
		System.out.println(alc);
		
		

	}

}
