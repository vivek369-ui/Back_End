public class Pattern{
	public static void main(String[] args) {
		int i, j, n=5;
		 for(i=1;i<=n;i++)  
		   {  
		       for(j=1;j<=n-1;j++)  
		       {  
		           System.out.print(" ");  
		       }  
		       for(int k=1;k<=2*i-1;k++)  
		       {  
		         System.out.print("*");  
		       }  
		       n--; 
			}
		}
}
