package JavaPractice;

public class LongestWordOfString {

	public static void main(String[] args) {
		//Finding longest word of String 
		String s ="I AM watching Dil dosti duniyadaari serial";
		String s1[] =s.split(" ");//[I, AM, watching, Dil, dosti, duniyadaari, serial]
		String s2="";
		 int LongestWordLength =0;
		int a=0;
		
		for(int i=0;i<s1.length;i++) 
		{                                  
			int WordLength = s1[i].length();
			//System.out.println(WordLength);
			if(WordLength>LongestWordLength)
			{
				LongestWordLength=WordLength;
				a=i;
			}
		}
		System.out.println("Longest word is " + s1[a] +" and length of word is "+LongestWordLength );
		
}
}
