package collection_framework;

import java.util.Iterator;
import java.util.PriorityQueue;

//the PriorityQueue class is an implementation of the Queue interface that
//provides a priority-based ordering of elements. Elements in a PriorityQueue are orderbased on their natural ordering or according to a specified comparator during construction.

public class Priority_Queue {

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		// Adding elements to the PriorityQueue
		// offer and add has a same work
		priorityQueue.offer(30);
		priorityQueue.offer(10);
		priorityQueue.offer(20);
		priorityQueue.offer(40);
		priorityQueue.offer(50);
		priorityQueue.offer(760);

		System.out.println("PriorityQueue: " + priorityQueue);

		System.out.println("its return the head of the queue:" + priorityQueue.peek());

		System.out.println("Removed from the front: " + priorityQueue.poll());

		System.out.println("Modified PriorityQueue: " + priorityQueue);
		Iterator <Integer> iter = priorityQueue.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(priorityQueue.poll()+ " ");
		}
	}

}
