package hacker_rank;
import java.util.Scanner;

public class Palandrom_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 String sr ="ram";
//		 String rev="";
//		 int length = sr.length();
//		 for(int i =sr.length()-1;i>=0;i--)
//		 {
//			 rev = rev+sr.charAt(i);
//		 }
//		 System.out.println(rev);
//		if( sr.equals(rev))
//		{
//			System.out.println("Yes");
//		}
//		else
//		{
//			System.out.println("No");
//		}
//		 
//		}
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
		StringBuilder str = new StringBuilder();
		str.append(A);
		System.out.println(""+str);
		System.out.println(""+str.reverse());
		if(A.compareTo(str.toString())==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	}
	

