package JavaPractice;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String s ="My School name IS geeta vidya mandir";
		String s1 = s.toLowerCase();
		String s3="";
		
		for(int i=0;i<s1.length();i++) 
		{
			char ch = s1.charAt(i);
			if(s3.indexOf(ch)==-1)
			{
				s3=s3+ch;
			}
		}
	 System.out.println(s3);
	

}
}