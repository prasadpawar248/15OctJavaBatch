package StarProgram;

public class Program3 
{
	public static void main(String[] args)
	{
		int x,y,z;
		for(x=1;x<=10;x++)
		{
			if(x<6)
			{
				for(y=x;y<5;y++)
				{
					System.out.print(" ");
				}
				for(z=1;z<=x;z++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(y=1;y<=(x-5);y++)
				{
					System.out.print(" ");
				}
				for(z=(x-5);z<5;z++)
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}
