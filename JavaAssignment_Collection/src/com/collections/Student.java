package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//Create Student class , create 3 objects of Student class. Add elements like id,name , age ,date of joining .
//Add all students in list and print all the elements of Student by iterating list
//Compare names of students using comparator.(Create NameComparator class)

public class Student implements Comparator<Student> {

	int id;
	String name;
	int age;
	String doj;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", doj=" + doj + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.id > o2.id) 
		{
			return -1;
		} 
		else if (o1.id < o2.id) 
		{
			return 1;
		} 
		else 
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(20, "Akshay", 28, "21/03/2022");
		Student s2 = new Student(250, "Aniket", 23, "22/03/2022");
		Student s3 = new Student(98, "Dhruv", 21, "23/03/2022");
		Student s4 = new Student(64, "Pavan", 26, "24/03/2022");

		ArrayList<Student> st = new ArrayList<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);

		Iterator<Student> itr = st.iterator();

		System.out.println("Iterator Output:-");
		System.out.println();

		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		System.out.println();
		System.out.println("Comparator Output:-");
		System.out.println();

		Collections.sort(st, new Student());
		// System.out.println(st);

		Iterator<Student> itr1 = st.iterator();
		while (itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}
	}


	
	
}
