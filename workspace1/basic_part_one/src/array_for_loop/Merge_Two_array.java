package array_for_loop;

public class Merge_Two_array {

	public static void main(String[] args) {

		int a[] = { 30, 25, 40 };

		int b[] = { 45, 50, 55, 60, 65 };

		int a1 = a.length;

		int b1 = b.length;

		int c1 = a1 + b1;

		int[] c = new int[c1];

		// Loop to store the elements of first
		// array into resultant array
		for (int i = 0; i < a1; i++) {

			c[i] = a[i];
		}

		for (int i = 0; i < b1; i = i + 1) {

			c[a1 + i] = b[i];
		}

		for (int i = 0; i < c1; i = i + 1) {

			// print the element
			System.out.println(c[i]);
		}
	}
}
