package com.collections;

import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class QueueDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;

		if (I1 > I2) 
		{
			return -1;
		} 
		else if (I1 < I2) 
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
		PriorityQueue pq = new PriorityQueue();
		pq.add("Aniket");
		pq.add("Akshay");
		
		System.out.println("Output of Priority queue");
		System.out.println(pq);
		System.out.println();

		PriorityQueue pq1 = new PriorityQueue(new QueueDemo());
		pq1.offer(23);
		pq1.offer(05);
		
		System.out.println("Sorted Elements are: ");
		System.out.println(pq1);
		System.out.println();

		Deque dq = new LinkedList<>();
		dq.add(1);
		dq.add("akshay");
		dq.add(2);
		dq.add("Pavan");
		dq.add(null);
		
		System.out.println("Deque Output:-");
		System.out.println(dq);
		System.out.println();

		dq.addFirst(3);
		dq.addLast(5);
		dq.addAll(pq1);
		
		System.out.println("Deque methods Output:-");
		System.out.println("After adding elements by method: ");
		System.out.println(dq);
		System.out.println();
		System.out.println("It contains given element or not:"+dq.contains("akshay"));
		System.out.println("It contains given whole queue or not:"+dq.containsAll(pq1));
		System.out.println("Getting First element of queue= "+dq.getFirst());
		System.out.println("Getting Last element of queue= "+dq.getLast());
		System.out.println("Getting Size of the queue= "+dq.size());
		System.out.println();
		System.out.println("Remove added whole queue:");
		dq.removeAll(pq1);
		System.out.println();

		Iterator itr = dq.descendingIterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		pq.poll();
		pq.poll();

		try 
		{
			pq.remove();
		} 
		catch (NoSuchElementException nsee) 
		{
			System.out.println("Exception Catched");
		} 
		finally
		{
			System.out.println("PriorityQueue after removing all elements: "+pq);
		}
		System.out.println();
		System.out.println("Queue: "+pq1);
		System.out.println("First Element: "+pq1.peek());
		System.out.println("First element"+pq1.element());
		pq1.poll();
		pq1.poll();
		System.out.println("After removing all element: "+pq1.peek());
		
		try 
		{
			System.out.println(pq1.element());
		} 
		catch (NoSuchElementException nse) 
		{
			System.out.println("Exception catched");
		}
		finally 
		{
			System.out.println("Queue after removing element and catching exception: "+pq1);
		}

	}

}
