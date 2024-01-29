//7.Write a Java program to perform basic Calculator operations.
import java.util.Scanner;
class Calculator{
	public static void main(String[] args) {
		char operator;
		Double no1, no2,result;

		Scanner input = new Scanner(System.in);

		System.out.println("Choose an operator: +,-,*or/");
		operator =input.next().charAt(0);

		System.out.println("Enter First Number:");
		no1 = input.nextDouble();

		System.out.println("Enter Second Number:");
		no2 = input.nextDouble();

		switch(operator){
 			case '+':
 					result = no1 + no2;
 					System.out.println("Addition is = "+result);
 					break;
 			case '-':
 					result = no1 - no2;
 					System.out.println("Subtraction is = "+result);
 					break;		
 			case '*':
 					result = no1 * no2;
 					System.out.println("Multiplication is = "+result);
 					break;
 			case '/':
 					result = no1 / no2;
 					System.out.println("Division is = "+result);
 					break;
 			default:
 					System.out.println("Invalid Operator.");
 					break;				
		}
		input.close()
	}
}