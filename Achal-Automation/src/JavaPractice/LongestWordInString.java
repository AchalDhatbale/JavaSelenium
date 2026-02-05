package JavaPractice;

public class LongestWordInString {
public static void main(String[] args) {
	//Find the longest word in a sentence.
	String s ="I am Electrical Engineer";
	String arr[]=s.split(" ");
	int arr2[]=new int[arr.length];
	
 	for(int i=0;i<arr.length;i++)
	{
		arr2[i]= arr[i].length();
	
	}
	
	int highestNumber = arr2[0];

	for(int i=1;i<arr2.length;i++)
	{		
		if(arr2[i]>highestNumber)
		{	
	       highestNumber = arr2[i];
		  
	    }
	}
	
	System.out.println("largest number is "+arr[arr2.length-1]+ " and length is "+highestNumber);
}
}
  