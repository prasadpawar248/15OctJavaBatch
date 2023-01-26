package basicProgram;

public class DataType 
{
	public static void main(String [] args)
	{

		/*int []arr ={1,2,3,4,5};

		//int b=arr.length;

		System.out.println(arr.length);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		for(int j:arr)
		{
		System.out.println(j);
		}*/
		
	/*	int multiarr[][]={{10,20,30},{40,50,60}};

		for(int i=0;i<multiarr.length;i++)
		{
			for(int j=0;j<multiarr[i].length;j++)
			{
				System.out.println(multiarr[i][j]);
			}
		}*/
		
		int multiarr[][]={{10,20,30},{40,50,60}};
		
		for(int k[]:multiarr)
		{
			for(int l:k)
			{
			System.out.println(l);
			}
		}
		
	}

}
