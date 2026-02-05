package JavaPractice;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		//Write a program to reverse each word in a string.
		
		String s = "I am watching Dil dosti duniyadaari marathi serial";
		String s1[] =s.split(" ");
		String s2="";
		
		for(int i=0;i<s1.length;i++) 
		{
			int wordLength = s1[i].length();
			
			for(int j=wordLength-1;j>=0;j--)
			{
				s2 = s2+s1[i].charAt(j);
			}
			s2=s2+" ";
		}
		
		System.out.println(s2);
		
		
	}

}
