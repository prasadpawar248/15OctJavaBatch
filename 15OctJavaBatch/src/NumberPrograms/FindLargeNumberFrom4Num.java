package NumberPrograms;

public class FindLargeNumberFrom4Num 
{
	public static void main(String[] args)
	{
		int a=100,b=20,c=300,d=40;
		
		if(((a>b) && (a>c)) && (a>d))
		{
			System.out.println(a+" is larger number");
		}
		else if(((b>a) && (b>c)) && (b>d))
		{
			System.out.println(b+" is larger number");
		}
		else if(((c>a) && (c>b)) && (c>d))
		{
			System.out.println(c+" is larger number");
		}
		else 
		{
			System.out.println(d+" is larger number");
		}
		
	}

}
