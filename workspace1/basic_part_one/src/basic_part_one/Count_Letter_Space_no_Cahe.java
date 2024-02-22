package basic_part_one;

public class Count_Letter_Space_no_Cahe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(st);
	}

	public static void count(String st) {
		// TODO Auto-generated method stub
		char ch[] = st.toCharArray();
		int letter = 0;
		int space= 0;
		int num = 0;
		int other=0;
		for(int i =0 ;i<st.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
		}
		
	}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);

}

}
