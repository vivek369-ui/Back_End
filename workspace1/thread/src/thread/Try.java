package thread;



class Single extends Thread{
	
	public void run()
	{
		for(int i =4 ; i<=4;i++)
		{
			System.out.println("i");
		}
	}
	
}
class Try  {
	public static void main(String [] args) {
		
		Single t = new Single();
		t.start();
		
		
	}

}

