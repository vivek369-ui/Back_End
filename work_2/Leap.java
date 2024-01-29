//11.Java Program to Check Leap Year
import java.util.Scanner;
public class Leap{
    public static void main(String args[]){
    	int year;
        boolean leap = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year:");
        year = input.nextInt();

        if(year % 4 == 0)
        {

            if(year % 100 == 0){

                if(year % 400 == 0)
                    leap = true;
                else
                    leap = false;

            }
            else
                leap = false;
        }
        else
            leap = false;
        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }   
}