package all_concept;
//thread 

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
	public static void main() {
		
		Single t = new Single();
		t.start();
		
		
	}

}


























// whatever the process we want to execute in to the therad it will be write into run()
// implimenting thread using inheritance ND INTERFACE 	
//is indiviual running part of a program is called thread. program having a multiple thread 
//in java tread is a class . if we  want to access the thread method we have to crate obj of a thread 
// life cycle if thread (new,runnable,running,waiting/block,stop)
// thread is always start with a Start() , run(), sleep() wait() , stop() thiks methods used in thread 