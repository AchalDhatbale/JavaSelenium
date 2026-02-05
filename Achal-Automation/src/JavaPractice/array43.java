package JavaPractice;

public class array43 {
	public static void main(String[] args) {
		int[]arr= {2,6,9,5,3,8,7,2,6};
		int smallest = arr[0];
		int secondsmallest=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest||arr[i]<secondsmallest)
			{
				secondsmallest=smallest;
				smallest=arr[i];
			}
		}
		System.out.println("Smallest is "+smallest);
		System.out.println("second Smallest is "+secondsmallest);
		
	}

}
