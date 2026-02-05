package JavaPractice;

public class CountOfEveryLetterInWord {
	public static void main(String[] args) {
		String s = "My Name is Achal";
		String s2[]=null;
		s=s.replaceAll(" ","").toLowerCase();//IloveSandip
		
		System.out.println(s);
		
		for(int i=0;i<s.length();i++) 
		{
			int count = 0;
			char ch = s.charAt(i);//ch=I
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))//I==I
				{
					count++;//
				}
			}
			
			System.out.println(ch+" appears" +count+ " time in a string");//this works fine 
			//but if letter repeats for 3 time then it prints that for 3 time we want to print only once
			
			
		}
	}

}
