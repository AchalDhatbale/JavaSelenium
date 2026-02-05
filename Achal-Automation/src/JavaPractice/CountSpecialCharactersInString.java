package JavaPractice;

public class CountSpecialCharactersInString {
	//Write a program to count number of special characters in a string
	
	public static void main(String[] args) {
		
		String s = "Wri@te^program$to*count%number!of#special";
		int SpecialCount = 0;
		
		for(int i=0;i<s.length();i++)
		  {
			char ch = s.charAt(i);
			if(!(ch >= 'A' && ch<= 'Z') && !(ch >= 'a' && ch<= 'z') && !(ch >= '0' && ch<= '9'))
			{
				SpecialCount++;
			}
		  }
		System.out.println("Count of special characters is "+SpecialCount);
		
		
	}

}
