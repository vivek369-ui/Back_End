//9.Java Program to Find GCD or HCF of 2 numbers
import java.util.Scanner;
public class GCD{
    public static void main(String args[]){
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter No1:");
    	int no1 = input.nextInt();

    	System.out.println("Enter No2:");
    	int no2 = input.nextInt();

    	int GCD = (no1 < no2) ? no1 : no2;

    	while(true){
    		if(no1%GCD == 0 && no2%GCD ==0 )
    		{
    			System.out.println("The GCD of " + no1 + " and " + no2 + " is " + GCD);
    			break;
    		}
    		else{
    			--GCD;
    		}
    	}
    }
}