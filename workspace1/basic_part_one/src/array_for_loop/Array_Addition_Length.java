package array_for_loop;

public class Array_Addition_Length {

	public static void main(String[] args) {
	
		int sum = 0;
		int r=0;
		int[] a = { 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println("addition :" + sum);
		
              r= sum/a.length;
              System.out.println("avarage:"+r);
	}

}
