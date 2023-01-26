package StarProgram;

public class RightTriangleStar2 
{
	public static void main(String [] args)
	{
		int i,j,z;
		for(i=1;i<=5;i++)
		{
			for(j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(z=i;z<=5;z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
