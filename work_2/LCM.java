//8.Java Program to Find LCM of 2 numbers
import java.util.Scanner;
public class LCM{
    public static void main(String args[]){
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter No1");
    	int no1 = input.nextInt();

    	System.out.println("Enter No2");
    	int no2 = input.nextInt();

    	int LCM = (no1 > no2) ? no1 : no2;

    	while(true){
    		if(LCM%no1 == 0 && LCM%no2 ==0)
    		{
    			System.out.println("The LCM of "+no1+ " and " +no2+ " is " +LCM);
    			break;
    		}
    		else{
    			++LCM;
    		}
    	}
    }   
}