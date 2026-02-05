package JavaPractice;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
    //Write a program to remove duplicate characters from a string.
		
		String s = "I am watching Dil dosti duniyadaari marathi serial";
	    String res="";
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	char ch = s.charAt(i);
	    	if(res.indexOf(ch)==-1)
	    	{
	    		res=res+ch;
	    	}
	    }
	    System.out.println(res);
		
		
		
		
	}

}
