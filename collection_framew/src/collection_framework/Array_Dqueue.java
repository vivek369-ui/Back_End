package collection_framework;
import java.util.ArrayDeque;
//it follow fifo head and tail

public class Array_Dqueue {

	public static void main(String[] args) {
		
		        ArrayDeque<String> deque = new ArrayDeque<>();

		        // Adding elements to the front
		        deque.addFirst("Apple");
		        deque.addFirst("Banana");

		        // Adding elements to the end
		        deque.addLast("Orange");
		        deque.addLast("Grapes");

		        // Displaying the deque
		        System.out.println("Deque: " + deque);

		        // Removing elements from the front and end
		        System.out.println("Removed from front: " + deque.removeFirst());
		        System.out.println("Removed from end: " + deque.removeLast());

		        // Displaying the modified deque
		        System.out.println("Modified Deque: " + deque);
		    }
		


	}

