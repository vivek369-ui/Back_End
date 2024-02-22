package try_error_base;

//used for modification in string 
public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("vivek");
		StringBuffer str_1 = new StringBuffer("vivek");
		System.out.println(str.equals(str_1));
		System.out.println(""+str);
		System.out.println(str.append(" Gite "));
		System.out.println(str.insert(5, " Balabhau "));
	    System.out.println(str.delete(5, 14));
		
	    System.out.println(str.reverse());
	    System.out.println(str.length());
	    System.out.println(str.indexOf("vivek"));
	    for(int i=0;i<str.length();i++) {
	    System.out.println("returns the character at the specified index in a string : "+str.charAt(i));
	    }
	    
	    
	    
	}
}
