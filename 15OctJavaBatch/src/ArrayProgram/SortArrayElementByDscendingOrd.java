package ArrayProgram;

public class SortArrayElementByDscendingOrd 
{
	public static void main(String [] args)
	{
		int arr[] = {7,8,9,4,5,6,1,2,3};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		
		
		System.out.println("\n"+"Second largest element: "+arr[1]);
	}

}
