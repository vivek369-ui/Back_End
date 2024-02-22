package basic_part_one;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// String str = "Hello";
// 		char[] charArray = str.toCharArray();

// 		// Reverse the char array using swapping
// 		int start = 0;
// 		int end = charArray.length - 1;
// 		while (start < end) {

// 			char temp = charArray[start];
// 			charArray[start] = charArray[end];
// 			charArray[end] = temp;
// 			start++;
// 			end--;
// 		}

// 		        // Convert char array back to string
// 		        String reversedStr = new String(charArray);
// 		        System.out.println(reversedStr); 
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
