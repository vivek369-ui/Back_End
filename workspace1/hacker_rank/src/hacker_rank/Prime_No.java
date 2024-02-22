package hacker_rank;

public class Prime_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int a = 3;
		int count = 0; // its used to check how much no. divisible by 3
		if (a > 1) {
			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					count++;
				}
				if (count == 2) {
					System.out.println("is prime number");
				}
				else {
					System.out.println("not a prime no"+count);
				}
			}
		}
		else {
			System.out.println("is not prime number");
		}

	}

}
