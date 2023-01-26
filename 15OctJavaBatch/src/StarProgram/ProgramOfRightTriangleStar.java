package StarProgram;

public class ProgramOfRightTriangleStar
{
	public static void main(String [] args)
	{
		int p,q,r;
		for(p=1;p<=5;p++)
		{
			for(q=p;q<5;q++)
			{
				System.out.print(" ");
			}
			for(r=1;r<=p;r++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
