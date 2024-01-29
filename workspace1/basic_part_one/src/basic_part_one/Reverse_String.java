package basic_part_one;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Scanner Sc = new Scanner(System.in);
//		System.out.println("input string:");
//		char letters[] = Sc.nextLine().toCharArray();
//		System.out.println("revese the String:");
//		for (int i = letters.length - 1; i >= 0; i--) {
//			System.out.print(letters[i]);
//		}
//		System.out.println("\n");
		 String st ="ram";
		 String rev ="";
		 System.out.println(""+st);
		 int length = st.length();
		 for(int i = length-1;i>=0;i--) {
			 rev =rev+st.charAt(i);//+used for concating the 2string 
			}
		 System.out.println(""+rev);
		
//		StringBuffer sb = new StringBuffer("hello");
//		sb.reverse();
//		System.out.println(sb);
	}

}
