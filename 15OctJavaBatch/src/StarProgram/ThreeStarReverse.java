package StarProgram;

public class ThreeStarReverse 
{
	public static void main(String[] args)
	{
		int a,b,c;
		for(a=10;a>=1;a--)
		{
			if(a%2==1)
			{
			for(b=9;b>a;b--)
			{
				System.out.print(" ");
			}
			for(c=1;c<=a;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
			}
			
		}
	}

}
