package basic_part_one;

import java.util.Scanner;

public class Comapre_Two_Number {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int no_1 , no_2 ;
		System.out.println("enter first no:");
		no_1  = sc.nextInt();
		System.out.println("enter second no:");
		no_2 = sc.nextInt();
//		if ( no_1 == no_2 )           
//            System.out.printf( "%d == %d\n", no_1, no_2 );  
//		
//        if ( no_1 != no_2 )          
//            System.out.printf( "%d != %d\n", no_1, no_2 ); 
//        
		if(no_1>no_2)
		{
			System.out.println("no_1 is greater:"+no_1);
		}
		else
		{
			System.out.println("no_2 is greater:"+no_2);
		}
	}

}
