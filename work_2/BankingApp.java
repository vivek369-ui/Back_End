import java.util.Scanner;
class BankDetails
{
    private String acc_no;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);

    //Method to open New account
    public void openAccount()
    {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextLine();

        System.out.print("Enter Account Type: ");  
        acc_type = sc.nextLine();
    
        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();
    
        System.out.print("Enter Your Balance: ");  
        balance = sc.nextLong();
    }   

    //method to display account details

    public void showAccount()
    {
        System.out.println("Account Number: "+acc_no);
    
        System.out.println("Account Holder Name: "+name);
    
        System.out.println("Account Type: "+acc_type);  
    
        System.out.println("Your Balance: "+balance+"₹");  
    }

    //method to deposit money 

    public void deposit()
    {
        long amt;
        System.out.print("Enter the amount you want to deposit: "); 
        amt = sc.nextLong();
        balance = balance + amt;

    } 

    //method to withdraw money 
    public void withdraw()
    {
        long amt;
        System.out.print("Enter the amount you want to withdraw: "); 
        amt = sc.nextLong();
        if(balance>=amt)
        {
            balance = balance - amt;
            System.out.println("Your Remaining Balance is : "+balance+"₹");
        }
        else
        {
            System.out.println("Your balance is less than\tTransaction failed...!!" ); 
            System.out.println("\nTransaction failed...!!" );
        }

    } 

    //method to search an account number

    public boolean search(String ac_no)
    {
        if(acc_no.equals(ac_no))
        {
            showAccount();
            return (true);
        }
        return (false);
    }
}

public class BankingApp
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 

        // Create intial Account.

        System.out.print("How many number of customers do you want to add: ");  
        int n = sc.nextInt();
        BankDetails C[] = new BankDetails[n];
        for(int i=0; i<C.length; i++)
        {
            C[i] = new BankDetails();
            C[i].openAccount();
        }

        // loop runs until number 5 is not pressed to exit
        int ch;
        do
        {
            System.out.println("\n****************Banking System Application****************");
            System.out.println("1.Display account details \n2.Search Account by account Number \n3.Deposit \n4.Withdraw \n5.Exit");
            System.out.println("Enter Your choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                        for(int i=0; i<C.length; i++)
                        {
                            C[i].showAccount();
                        }
                        break;
                case 2:
                        System.out.println("Enter your Account Number:");
                        String ac_no = sc.nextLine();
                        boolean found = false;
                        for(int i=0; i<C.length; i++)
                        { 
                            found = C[i].search(ac_no);
                            if(found)
                            {
                                break;
                            }
                            if(!found)
                            {
                                System.out.print("Account doesn't exist....!!!!");
                            }
                        }
                        break;
                case 3:
                        System.out.print("Enter your Account Number:");
                        ac_no = sc.next();
                        found = false;
                        for(int i=0; i<C.length; i++)
                        { 
                            found = C[i].search(ac_no);
                            if(found)
                            {
                                C[i].deposit();
                                break;
                            }
                            if(!found)
                            {
                                System.out.println("Account doesn't exist....!!!!");
                            }
                        }
                        break;      
                case 4:
                        System.out.print("Enter your Account Number:");
                        ac_no = sc.next();
                        found = false;
                        for(int i=0; i<C.length; i++)
                        { 
                            found = C[i].search(ac_no);
                            if(found)
                            {
                                C[i].withdraw();
                                break;
                            }
                            if(!found)
                            {
                                System.out.println("Account doesn't exist....!!!!");
                            }
                        }

                        break;
                case 5:
                        System.out.println("Thank You ....!");  
                        break;      

            }
        }while (ch!=5);
    }
}








