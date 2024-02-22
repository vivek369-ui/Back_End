package try_error_base;
// Multiple Inheritance is the process in which a subclass inherits more than one superclass.
// diamond problem in java compiler diesnt know which super class method to execute.
//class A
//{
//    public void execute()
//    {
//        System.out.println("Hi.. Executing From Class A");
//    }
//}
//class B
//{
//    public void execut()
//    {
//        System.out.println("Hi.. Executing From Class B");
//    }
//}
//class C extends A , B
//{
//    
//}
//public class Multiple_Inheritance
//{
//	public static void main(String[] args) 
//	{
//        C obj = new C(); // creating object of class C
//        obj.execute(); // execute() method is present in both class A and B
//	}
//}

// using interface

interface A
{
    public abstract void execute1();
}
interface B
{
    public abstract void execute2();
}
class C implements A,B
{
    public void execute1()
    {
        System.out.println("Haii.. I am from execute1");
    }
    public void execute2()
    {
        System.out.println("Haii.. I am from execute2");
    }
}
public class Multiple_Inheritance
{
	public static void main(String[] args) 
	{
		C obj = new C(); // creating object of class C
		obj.execute1(); //calling method execute1
		obj.execute2(); // calling method execute2
	}
}
