package ArrayProgram;

public class SortArrayElementbyAscendingOrd 
{
	public static void main(String[] args)
	{
		int arr[]= {9,1,1,8,3,4,5,6,9};
		
		for(int i=0;i<arr.length;i++)  //0-8
		{
			for(int j=0;j<arr.length-1;j++) //0-7
			{
				if(arr[j]>arr[j+1])  //8>9
				{
					int k=arr[j];  //8
					arr[j]=arr[j+1];  //6
					arr[j+1]=k;  //8           2,1,7,3,4,5,6,8,9
				}
			}
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
	}

}
