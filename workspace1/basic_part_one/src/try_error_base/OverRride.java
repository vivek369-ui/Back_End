package try_error_base;

class Calculater
{
	public int add(int n1 ,int n2)
	{
		return n1+n2;
	}
}

class AdvCal extends Calculater{
	public int add(int n1 , int n2)
	{
		return n1+n2+3;
	}
}

public class OverRride {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvCal obj = new AdvCal();
		int f = obj.add(2, 3);
		System.out.println("method  overriding "+f);

	}

}

// methed name and parameter are same but behawer is diff
//In Java, Overriding is a feature that allows a subclass or child class to provide a specific
//implementation of a method that is already provided by one of its super-classes or parent classes
//The main purpose of having overridden 
//methods in the child is having a different implementation for a method that is present in the parent class.