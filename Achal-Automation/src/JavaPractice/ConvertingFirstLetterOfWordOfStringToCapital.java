package JavaPractice;

public class ConvertingFirstLetterOfWordOfStringToCapital {
	//this program is to convert first letter of word into capital letter 

	public static void main(String[] args) {
		String s = "this is laptop";
		String [] arr = s.split(" ");
		
	   for(int i=0;i<arr.length;i++)
		 {
           char firstLetter1 =  arr[i].charAt(0);
           String firstLetter2 = Character.toString(firstLetter1).toUpperCase();
           String From2ndletter =  arr[i].substring(1);
           System.out.print(firstLetter2+From2ndletter+" ");
           
		 }

	}

}
