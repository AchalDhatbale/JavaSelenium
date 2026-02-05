package JavaPractice;

public class CountOfReoccuringCharacter {

	public static void main(String[] args) {
		// Count how many times a character appears in a string.
		String s = "This is java code";
		char ch = 'z';
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(ch+" appers "+ count + " times in a string" );
		
	}

}
