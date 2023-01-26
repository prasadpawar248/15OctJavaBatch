
package StarProgram;

public class Program1 
{
	public static void main(String[]args)
	{
		
		for(int i=1;i<=10;i++)
		{
			int j,k;
			
			if(i<5)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("*"+" ");
				}
			}
			else
			{
				for(k=(i-5);k<5;k++)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}

}
