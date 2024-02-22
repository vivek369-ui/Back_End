package basic_part_one;

public class Prime_No {

	public static void main(String[] args) {

		int no = 13 ;
		boolean prime = true;

		for (int i = 2; i <= no; i++) {
			if (no % i == 0) {
				 prime = false;
				break;
			}

		}
		System.out.println(prime);
	}
}

//int no = 9;
//
//for(int i = 2; i<=no;i++)
//{
//	 	if (no %i==0)
//	 	{
//	 		System.out.println("its not prime no ");
//	 	}
//	 	else
//	 	{
//	 		System.out.println("its prime no ");
//	 	}
//}
//}
