//10.Java Program to Display All Prime Numbers from 1 to N
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
    	int i,n;
    	Scanner input = new Scanner(System.in);

    	System.out.println("Enter the N Number:");
    	n = input.nextInt();

    	for(i=2;i<=n;i++)
    	{
    		int count=0;
    		for(int j=2;j<i;j++)
    		{
    			if(i%j==0){
    			count++;
    			}
    		}
    		if(count ==0){
    			System.out.println(i);
    		}
    	}
    }
}    