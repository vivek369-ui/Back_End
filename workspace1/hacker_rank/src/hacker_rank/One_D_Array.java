package hacker_rank;

import java.util.Scanner;

public class One_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		for (i = 0; i< a.length; i++) {
			a[i] = scan.nextInt();
			
		}
		for(i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}

}
