package StarProgram;

public class Program4 
{
	public static void main(String[] args)
		{
		int a,b,c;
		for(a=1;a<=9;a++)
			{
				if(a<6)
				{
					for(b=1;b<a;b++)
					{
						System.out.print(" ");
					}
					for(c=a;c<=5;c++)
					{
						System.out.print("* ");
					}
					
				}
				else
				{
					for(b=(a-5);b<4;b++)
					{
						System.out.print(" ");
					}
					for(c=1;c<=(a-4);c++)
					{
						System.out.print("* ");
					}
				}
				System.out.println();
			}

	}
}
