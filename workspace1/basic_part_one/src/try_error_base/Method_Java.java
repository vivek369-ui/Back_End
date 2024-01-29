package try_error_base;

//passing argument by value

public class Method_Java {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int x = 1;
//		increment(x);
//		System.out.println("main" + x);
// }
//      private static void increment(int x) {
//		// TODO Auto-generated method stub
//		x++;
//		System.out.println("method" + x);
//  }
//}
	public static int sum(int x, int y)// parameters
	{
		return x + y;
	}
	public static void main(String[] args) {
		int r = sum(1, 2);// argument
		System.out.println("" + r);
	}
}

//public static   void hi()
//{Sysout("hi")};
// return : a value from method
//public : access from outside of the class
// static :  we able to call this method from inside the main method