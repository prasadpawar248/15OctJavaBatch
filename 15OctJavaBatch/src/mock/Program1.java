package mock;

public class Program1 
{
	public static void main(String[]args)
	{
		String string="welcome in java program";
		
		String arr[]=string.split(" ");
		//String newstr[]=new String[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			//newstr[i]=arr[i];
			System.out.println(arr[i]);
		}
		
		
	}

}
