//12.Java Program to Check Armstrong Number between Two Integers
import java.util.Scanner;
public class ArmstrongBetTwoNumbers{
	public static void main(String[] args) {
		int no1,no2;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the frist Number :");
		no1 = input.nextInt();

		System.out.println("Enter the second Number :");
		no2 = input.nextInt();

		for(int i=no1;i<no2;i++)
		{
			int check,rem,sum = 0;
			check = i;
			while(check!=0)
			{
				rem = check%10;
				sum = sum + (rem*rem*rem);
				check = check/10;
			}
			if(sum == i){
				System.out.println(""+i+" is an Armstrong number.");
			}
		}

	}	
}