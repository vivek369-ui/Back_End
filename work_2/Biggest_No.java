//6.Java Program to Find Largest Among 3 Numbers.
import java.util.Scanner;
public class Biggest_No
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int x = s.nextInt();
		System.out.println("Enter the second Number:");
		int y = s.nextInt();
		System.out.println("Enter the Third Number:");
		int z = s.nextInt();
		if(x > y && x > z)
		{
			System.out.println("Largest Number is:"+x);
		}
		else if(y > x && y>z)
		{
			
			System.out.println("Largest Number is:"+y);
		}
             else if (z>x && z>y)
                  {
                       System.out.println("largest no is"+z);
          }

 


                 
		else 
		{
			
			System.out.println("no is equal");
		}
		
	}
}