package basic_part_one;

import java.util.Scanner;

public class Add_Two_Binary_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int remainder = 0;
		int[] sum = new int[20];
		Scanner in = new Scanner(System.in);
		System.out.println("input first binary number");
		long binary_1 = in.nextLong();
		System.out.println("input second  binary number");
		long binary_2 = in.nextLong();

		while (binary_1 != 0 || binary_2 != 0) {
			sum[i++] = (int) ((binary_1 % 10 + binary_2 % 10 + remainder)%2);
			remainder = (int) ((binary_1 % 10 + binary_2 % 10 + remainder)/2);
			binary_1 = binary_1 / 10;
			binary_2 = binary_2 / 10;

		}

		if (remainder != 0) {
			sum[i++] = remainder;
		}
		--i;

		System.out.println("sum of two binary number");
		while (i >= 0) {
			System.out.println(sum[i--]);
		}
		System.out.println("");

	}

}
