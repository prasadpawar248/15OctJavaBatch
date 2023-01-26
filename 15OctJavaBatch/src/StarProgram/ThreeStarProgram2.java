package StarProgram;

public class ThreeStarProgram2 
{
	public static void main(String[] args)
	{
		int a,b,c;
		for(a=1;a<=10;a++)
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
		for(a=8;a>=1;a--)
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
