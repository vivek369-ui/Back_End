public class RevPyramid{
	public static void main(String args[]) {
		int i,j,k,n=5;
		for(i=1; i<=n; i++)
		{
			for(j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(k=i; k<=5; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}