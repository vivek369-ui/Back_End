package hacker_rank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b =sc.nextLine();	
		char c_one[] = a.toCharArray();
		char d_two[] =b.toCharArray();
//		if(c_one.length!= d_two.length) 
//		{
//			System.out.println("is not a alagram");
//		}
	
	Arrays.sort(c_one);
	Arrays.sort(d_two);
	boolean rasult = Arrays.equals(c_one,d_two);
		if(rasult==true)	{
		System.out.println("string are anagram");
			}
		else
		{
			System.out.println("somthing is wrong");
		}
}
	}
	