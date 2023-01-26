package NumberPrograms;

public class FindLargestOfThreeNumber 
{
	public static void main(String[] args)
	{
		
	// largest of three number
		
		int a=70;
		int b=50;
		int c=46;
		
		if((a>b) && (a>c))
		{
			System.out.println("a is larger number");
		}
		else if((b>a) && (b>c))
		{
			System.out.println("b is larger number");
		}
		else
		{
			System.out.println("c is larger number");
		}
		
	//smaller of three number
		
		int x=10;
		int y=15;
		int z=5;
		
		if((x<y) &&(x<z))
		{
			System.out.println("x is smaller number");
		}
		else if((y<x) && (y<z))
		{
			System.out.println("y is smaller number");
		}
		else
		{
			System.out.println("z is smaller number");
		}
		
	}

}
