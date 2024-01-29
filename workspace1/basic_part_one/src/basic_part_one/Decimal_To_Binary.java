package basic_part_one;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b= "";
		int dec_no =47;
		int t = dec_no ; 
		while(t>0)
		{
			int r = t % 2;
			t=t/2;
			b = r+b;
		}
		
		System.out.println( "decimal:" +dec_no+ "\nbinary:"+b);
	}
}
