package programs;

import java.io.*;

public class Serialize{
	public class Employee {
		public String name;
		public String address;
		public String SSN;
		public String number;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Ruturaj khade";
		e.address = "ap jatharwadi, tal-karvir,dist-kolhapur,416122";
		e.SSN = "11122222333333";
		e.number = "9561861853";

		try{
			FileOutputStream fileOut = new FileOutputStream("C:/Users/vitthal khade/Desktop/Demo/emply.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp.emply.txt");

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}