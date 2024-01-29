package all_concept;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pattern pt = Pattern.compile("skill");
//		Matcher match = pt.matcher("skill");
//		if(match.matches()) {
//			System.out.println("matches");
//			
//		}
//		else
//		{
//			System.out.println("not matches");
//		}
//    	String m = "my tseb rrjnv "; 
//		Pattern pt = Pattern.compile("[A-Z]");
//     	Matcher match = pt.matcher(m);
//     	
//     	while(match.find()) {
//     		System.out.print(m.substring(match.start(),match.end()));
//     	}
 int count =0;
	Pattern pt = Pattern.compile("my class");
	Matcher ma = pt.matcher("my class e");
	while(ma.find())
	{
		count++;
		System.out.println(ma.start());
	}
		System.out.println(""+count);
		
		

	}

}
