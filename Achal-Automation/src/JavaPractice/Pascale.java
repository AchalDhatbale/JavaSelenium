package JavaPractice;

public class Pascale {

	public static void main(String[] args) {
		int[][]arr=new int[5][];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =new int[i+1];
			for(int j=0;j<arr[i].length;j++)
			{
				if(j==0||j==i)
				{
					arr[i][j]=1;
				}
				else
				{
					arr[i][j]= arr[i-1][j-1]+arr[i-1][j];
				}
			}
			//System.out.println();
		}
		
		for(int [] res :arr)
		{
			for(int res1 : res)
			{
				System.out.print(res1+" ");
			}
			System.out.println();
		}

	}

}
