package array_for_loop;

import java.util.Scanner;

public class User_Input_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr =new int[3];
		System.out.println("input the array:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("array element are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(""+arr[i]);
		}
		

	}

}
