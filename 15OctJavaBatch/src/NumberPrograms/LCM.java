package NumberPrograms;

public class LCM 
{
	public static void main(String[] args)
	{
		int a=5;
		int b=6;
		int k=4;
		
		int c=(a>b?a:b)>k?(a>b?a:b):k;
		boolean d=true;
		while(d==true)
		{
			if((c%a==0) && (c%b==0) && (c%k==0))
			{
			d=false;
			}
			else
			{
			c++;
			}
		}
		System.out.println("LCM number is: "+c);
	}

}
