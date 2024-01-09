package com.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//Explain use of Upperbound and lowerbound wildcards

public class GenericsWildCards {
	
	public static List m1(List l){
		
		System.out.println("without Generic");
		return l;
	}
	
	public static ArrayList<String> m2(ArrayList<String> l){
		
		System.out.println("with String Generic");
		return l;
	}
	public static ArrayList<Integer> m3(ArrayList<Integer> l1){
		
		System.out.println("with Integer Generic");
		return l1;
	}
	
	public static ArrayList<? extends Number> m4(ArrayList<? extends Number> l1){
		
		System.out.println("with child classes Generic");
		return l1;
	}
	
	public static ArrayList<? super Number> m5(ArrayList<? super Number> l1){
		
		System.out.println("with Parent classes Generic");
		return l1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object>l = new ArrayList<>();
		l.add("Akshay");
		l.add("Aniket");
		l.add(2);
		l.add(5);
		
		ArrayList<Float> l1 = new ArrayList<>();
		l1.add(1f);
		l1.add(2f);
		l1.add(3f);
		l1.add(4f);
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		
		System.out.println(GenericsWildCards.m1(l));
		System.out.println();
		System.out.println(GenericsWildCards.m3(l2));
		System.out.println();
		System.out.println(GenericsWildCards.m4(l2));
		System.out.println();
		System.out.println(GenericsWildCards.m5(l));
		
	}

}
