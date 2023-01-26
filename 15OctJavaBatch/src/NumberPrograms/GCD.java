package NumberPrograms;

public class GCD 
{
	public static void main(String[] args)
	{
		
	//greatest common number
		
		int a=30,b=15;
		
		int c = 0;
		for(int i=1;((i<=a)&&(i<=b));i++) 
		{	
			//int c;
			if((a%i==0) && (b%i==0))
			{
				 c=i;
			}
			
		}
		System.out.println(c);
	}

}
