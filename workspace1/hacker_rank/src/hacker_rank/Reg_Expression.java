package hacker_rank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg_Expression {
	public static void main(String[] args)
	{
//		Pattern pattern = Pattern.compile(".r");
//		Matcher matcher = pattern.matcher("br");
//		boolean result = matcher.matches();
//		System.out.println(result);
		
		Pattern st = Pattern.compile("agent 007");
		Matcher matcher = st.matcher("agent 007");
		boolean find = matcher.find();
		System.out.println("found"+find);
}

}

 