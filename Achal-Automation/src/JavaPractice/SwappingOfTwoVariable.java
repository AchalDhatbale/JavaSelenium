package JavaPractice;

public class SwappingOfTwoVariable {

	public static void main(String[] args) {
		//Swap two Strings without using a third variable
		String Achal = "Achal";
	    String Pranjal ="Pranjal";
	    
	  String  Achal1 = Achal+Pranjal;
	    //System.out.println(Achal);
	    Achal = Achal1.replaceAll(Achal,"");
	    System.out.println(Achal);
	    Pranjal   = Achal1.replaceAll(Pranjal,"");
	    System.out.println(Achal);
	    System.out.println(Pranjal);

	    

	}

}
