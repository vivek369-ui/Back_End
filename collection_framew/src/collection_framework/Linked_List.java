package collection_framework;

import java.util.LinkedList;

// the list has a head,which is a reference to the first node in the list(the head store  only  the address of the 1st node)
//Each node holds a single value and a reference to the next node in the list.
// last node store value and null 
//methods add getfirst, getlast, addfirst, addlast, removefisrt, removlast.
// is faster in maniuplation of data.
//You can also use LinkedList as a Deque.
public class Linked_List {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		System.out.println("Linked List: " + linkedList);

		System.out.println("get first  :" + linkedList.getFirst());
		System.out.println("get last  :" + linkedList.getLast());

		// Adding an element at the beginning
		linkedList.addFirst("Grapes");
		System.out.println("adding the elemnt in 1st" + linkedList);

		linkedList.addLast("Mango");
		System.out.println("Adding an element at the end" + linkedList);

		System.out.println("Modified Linked List: " + linkedList);

		// Removing an element from the beginning
		linkedList.removeFirst();

		// Removing an element from the end
		linkedList.removeLast();

		System.out.println("Final Linked List: " + linkedList);

	}

}
