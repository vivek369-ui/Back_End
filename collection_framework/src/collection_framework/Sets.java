package collection_framework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//set does not contain duplicate value
//hash set is not giving you a value in sequence  in tree set is provide value in sequence 

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> val = new HashSet<>();
		val.add(1);
		val.add(9);
		val.add(3);
		val.add(4);
		val.add(1);
		System.out.println(""+val);
		
		for(int i : val)
		{
			System.out.println(i);
		}
//		int a = val.size();
//		
//		for (int i =0 ;i<a;i++)
//		{
//			System.out.print(i);
//		}
		System.out.println("*************TreeSet****************");
		
		Set<Integer> va = new TreeSet<>();val.add(1);
		va.add(3);
		va.add(4);
		va.add(1);
		System.out.println(va);
		
		
		}

	}


