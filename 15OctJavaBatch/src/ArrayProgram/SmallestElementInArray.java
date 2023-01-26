package ArrayProgram;

public class SmallestElementInArray 
{
	public static void main(String [] args)
	{
		int arr[] = {12,23,4,5,63,10};
		int num=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<num)
			{
				num=arr[i];
			}
		
			//num=num<arr[i]?num:arr[i];
		}
		System.out.println("Smallest element in array is: "+num);
	}

}
