package collection_framework;
import java.util.ArrayList;
import java.util.Collections;
//in array we storer primitve data type  and obj  and in array list we store only obj (heap =data store in tree like structure)
//add ,get ,modify ,delete , iterate
//is faster in accessing and sorting data

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("print all element :" + list);

		// get element
		int element = list.get(0);
		System.out.println("get element from index position zaro :" + element);

		// add element in between
		list.add(0, 32);
		System.out.println("after adding  a new element in list :" + list);

		// set element
		list.set(2, 34);
		System.out.println("set new index  value to exting index" + list);

		// delete element
		list.remove(2);
		System.out.println("remove element from list" + list);

		list.size();
		System.out.println("size of list"+list);

		// itrate through loop

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		// collection sort function in
		Collections.sort(list);
		System.out.println("sorting the list " + list);

	}

}
