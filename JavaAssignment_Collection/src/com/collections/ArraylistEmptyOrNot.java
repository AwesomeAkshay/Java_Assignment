package com.collections;

import java.util.ArrayList;

public class ArraylistEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to test whether an array list is empty or not.
		ArrayList<String> al = new ArrayList<>();
		al.add("Akshay");
		al.add("Aniket");
		al.add("Pavan");
		
		boolean isEmpty=al.isEmpty();
		
		if(isEmpty)
		{
			System.out.println("Arraylist is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}

	}

}
