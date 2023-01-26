package ArrayProgram;

public class LargestElementInArray 
{
	public static void main(String [] args)
	{
		int arr[] = {4,65,78,200,7,98};
		int num=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				num=arr[i];
			}
		}
		System.out.println("Largest element in array is: "+num);
		
		
	}
	
	
}
