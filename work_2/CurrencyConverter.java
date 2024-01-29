import java.util.Scanner;
import java.text.DecimalFormat;
public class CurrencyConverter
{
 	public static void main(String args[]) {
 		double amount;
 		double USD,EURO,KWD,GBP,CNY,JYP;
 		int choice;

 		DecimalFormat f = new DecimalFormat("##.##");
 		Scanner sc = new Scanner(System.in);

 		do
 		{
 			System.out.print("\n 0.exit \n 1.US Doller \n 2.EURO \n 3.Kuwaiti Dinar \n 4.British pound \n 5. Chinese Yuan \n 6. Japanise Yen");
 			
 			System.out.println("\n Select your choice : ");
 			choice = sc.nextInt();


 			switch(choice)
 			{
 				case 0:
						break;
 				case 1:
 						System.out.println("\n Enter the amount in INR:");
 						amount = sc.nextFloat();
		 				USD = amount/71.58;
						System.out.println("Converted amount : "+f.format(USD)+" Doller");
						break;
				case 2:
 						System.out.println("\n Enter the amount in INR:");
 						amount = sc.nextFloat();
		 				EURO = amount/86.99;
						System.out.println("Converted amount : "+f.format(EURO)+" EURO");
						break;
				case 3:
 						System.out.println("\n Enter the amount in INR:");
 						amount = sc.nextFloat();
		 				KWD = amount/244.69;
						System.out.println("Converted amount : "+f.format(KWD)+" Dinar");
						break;
				case 4:
 						System.out.println("\n Enter the amount in INR:");
 						amount = sc.nextFloat();
		 				GBP = amount/101.92;
						System.out.println("Converted amount : "+f.format(GBP)+" pound");
						break;
				case 5:
 						System.out.println("\n Enter the amount in INR:");
 						amount = sc.nextFloat();
		 				CNY = amount/11.40;
						System.out.println("Converted amount : "+f.format(CNY)+" Yuan");
						break;
				case 6:
 						System.out.println("\n Enter the amount in INR:");
 						amount = sc.nextFloat();
		 				JYP = amount/0.67;
						System.out.println("Converted amount : "+f.format(JYP)+" Yen");
						break;										
 			}

 		}while(choice!=0);
 	}
}