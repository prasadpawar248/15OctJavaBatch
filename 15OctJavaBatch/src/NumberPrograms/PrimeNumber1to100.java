package NumberPrograms;

public class PrimeNumber1to100 
{
	public static void main(String [] args)
	{
		for(int i=1;i<=100;i++)
		{
			int count=0;
			int j=1;
			while((j<=i)&&(count<=2))
			{
				if(i%j==0)
				{
					count++;
				}
				j++;
			}
			if(count<=2)
			{
				System.out.println(i);
			}
		}
	}

}
