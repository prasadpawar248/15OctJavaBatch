package StringProgram;

public class ReverseString 
{
	public static void main(String[]args)
	{
	//-------------word reverse---------------
		String a="java";
		
		for(int i=(a.length()-1);i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		System.out.println();
		
	//----------sentence reverse------------
		String b="welcome in java programming";
		for(int j=(b.length()-1);j>=0;j--)
		{
			System.out.print(b.charAt(j));
		}
		System.out.println();
		
		String c="this is java program";
		String d[]=c.split(" ");
		
		for(int i=d.length-1;i>=0;i--)
		{
			System.out.print(d[i] +" ");
		}
	}

}
