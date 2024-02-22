abstract class Main{
	
	abstract void start();
}
class Car extends Main{
void start()
{
	System.out.print("start with key");
}	
}
class Scooter extends Main{
	void start(){
		System.out.print("start with kick");
	}
	public static void main(String[] args) {
		Car c =new Car();
		c.start();

		Scooter s=new Scooter();
		s.start();
	}
}