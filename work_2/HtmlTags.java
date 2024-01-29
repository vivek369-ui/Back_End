import java.util.Scanner;
public class HtmlTags
{
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		int ch;
		String tag;
		StringBuilder sb = new StringBuilder();

		System.out.println("\n 1. <html> Tags");
		System.out.println("\n 2. <head>Tags");
		System.out.println("\n 3. <body>Tags");
		
		System.out.println("\n 0. exit");


		do
		{

			
			System.out.println("\nEnter Tag :--");
			ch=sc.nextInt();

			switch (ch) 
			{
					
					case 1:
							System.out.println("");
							tag=sc.next();
							switch(tag)
							{
								case "html":
								sb.append("\n<html>");
							    break;

							    case "/html":
										sb.append("\n</html>");
										break;								default:
								System.out.print("\nInvalid tag");
							}    
							break;
						    						
					case 2:
							System.out.println("");
							tag = sc.next();
							switch(tag)
							{
								case "head":	
									sb.append("\n<head>");
									break;
								case "title":
										 
										Scanner input = new Scanner(System.in);
										System.out.println("\nDo you want give any title 'Yes'or'No'");
										String flag = input.nextLine(); 
				                        switch(flag)
										{
											case "Yes":
												System.out.print("\nEnter Title:");				                        	
					                        	String title= input.nextLine();
												sb.append("\n\t<title> "+title+" </title>");
												break;

											case "No":
												sb.append("\n\t<title> </title>");
												break;
										}
										break;
								case "/head":	
									sb.append("\n</head>");
									break;
								default:
								System.out.print("\nInvalid tag");

							}    
							break;		
					case 3:
							System.out.println("");
							tag=sc.next();
							switch(tag)
							{
								
								case "body":	
										sb.append("\n<body>");
										break;
								case "p":
										Scanner input = new Scanner(System.in);
										System.out.println("\nDo you want write any content in Paragraph 'Yes'or'No'");
										String flag = input.nextLine(); 
				                        switch(flag)
										{
											case "Yes":
												System.out.print("\nEnter Content:");				                        	
					                        	String para= input.nextLine();
												sb.append("\n\t<p> "+para+" </p>");
												break;

											case "No":
												sb.append("\n\t<p> </p>");
												break;
										}
										// sb.append("\n\t<p>  </p>");
										break;
								case "h1":
										Scanner head = new Scanner(System.in);
										System.out.println("\nDo you want write any content in header 'Yes'or'No'");
										String op = head.nextLine(); 
				                        switch(op)
										{
											case "Yes":
												System.out.print("\nEnter Content:");				                        	
					                        	String para= head.nextLine();
												sb.append("\n\t<h1> "+para+" </h1>");
												break;

											case "No":
												sb.append("\n\t<h1> </h1>");
												break;
										}
										// sb.append("\n\t<h1>  </h1>");
										break;
									
								case "/body":
										sb.append("\n</body>");
										break;	
								default:
								System.out.print("\nInvalid tag");		
										
							}  
							break;	
					
					case 0:
							break;
					default:
								System.out.print("\nInvalid tag");																	
					
			}
			

		}while(ch!=0);
	System.out.println("Entered Format is:-");
		 System.out.println(sb.toString());	
		
	}
}