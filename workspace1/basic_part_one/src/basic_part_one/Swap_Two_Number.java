package basic_part_one;

public class Swap_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int a =10, b= 20 ,temp;
				System.out.println("before swapping " +"a:" +a+ "b:" +b);
//				temp = a;
//				a=b;
//				b = temp;
//				
				a=a+b;
				b=a-b;
				a=a-b;
				
				System.out.println("after swapping " +"a:" +a+ "b:" +b);
			}

		

	}


