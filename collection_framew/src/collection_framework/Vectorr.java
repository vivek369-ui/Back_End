package collection_framework;

import java.util.Vector;

//  dynamic array-like data structure
//that can grow or shrink in size. It's similar to an array but provides more flexibility regarding its size

public class Vectorr {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(); // TODO Auto-generated method stub
		vec.add("Apple");
		vec.add("Banana");
		vec.add("Orange");
		System.out.println("add method" + vec);
		vec.add(1, "mango");
		System.out.println("" + vec);
		vec.remove(0);
		System.out.println(vec);
		int a = vec.size();
		System.out.println("size of vector:" + a);
		vec.remove("mango");
		System.out.println("remove" + vec);
		vec.remove(1);
		System.out.println(vec);

		vec.removeAll(vec);
		System.out.println("all remove" + vec);

	}

}
