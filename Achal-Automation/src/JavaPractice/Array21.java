package JavaPractice;

public class Array21 {

	public static void main(String[] args) {
		int[]arr1= {1,2,4,6,8,97,554,3,4,65,5};
		int size=(arr1.length%2==0?arr1.length/2:arr1.length/2+1);
		int[]arr2=new int[size];
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(i%2==0)
				{
					arr2[j]=arr1[i];
				}
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
