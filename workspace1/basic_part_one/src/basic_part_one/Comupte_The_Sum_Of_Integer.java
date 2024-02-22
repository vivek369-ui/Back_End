package basic_part_one;

import java.util.Scanner;

public class Comupte_The_Sum_Of_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0;
//		Scanner sc = new  Scanner(System.in);
//		long number = sc.nextLong();
//		System.out.println("The sum of the digits is: " + sumDigits(number));
//	}
//		 public static int sumDigits(long n) {
//		        int sum = 0;
//		        while (n != 0) {
//		            sum += n % 10;
//		            n /= 10;
//	}
// return sum;
		
	int number,r,sum=0;
	Scanner sc = new  Scanner(System.in);
	 number = sc.nextInt();
	 while(number>0)
	 {
		 r = number%10;
		 sum = sum+r;
		 number = number/10;
	 }
	 System.out.println(""+sum);
		
		
	 }
}

