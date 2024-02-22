 package try_error_base;

class Calculate {
	public void square() {
		System.out.println("no parameter is called");
	}

	public void square(int num) {
		int square = num * num;
		System.out.println("method with int :" + square);
	}

	public double square( float num ) 
	{
	return num * num;
	
	}
}

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj = new Calculate();
		obj.square();
		obj.square(4);
		//obj.square(3.3);

	}

}

//If we look carefully, to find the square of a number only, according to the data type of the number, we have to take three names as follows:
//int square ,double square, long square
//If it is possible that a programmer has to take only one name and the program itself decides which method to use for which type of value, then it will be easier for the programmer to get the same. There is no need to 
//memorise the names of more than one method for type work. In Java, we can give the above three methods the same name.
