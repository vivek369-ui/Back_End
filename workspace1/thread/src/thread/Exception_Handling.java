package thread;

class First{
	void display()
	{
		try 
		{
			int a = 5/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Exception handled");
		
	}
}

public class Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
              First obj = new First();
              obj.display();
              
              
	}

}
