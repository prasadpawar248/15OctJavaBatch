package ArrayProgram;

public class FindDuplicateElementInArray 
{
	public static void main(String[] args)
	{
		int arr[]= {12,54,12,10,24,12,10};
		
		for(int i=0;i<arr.length;i++)
		{
			boolean value=true;
			for(int k=0;k<i;k++)
			{
				if(arr[k]==arr[i])
				{
					value=false;
				}
			}
			if(value==true)
			{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])  //2==5
				{
					System.out.println(arr[i]);
					break;
				}
			}
			}
		}
	}

}
