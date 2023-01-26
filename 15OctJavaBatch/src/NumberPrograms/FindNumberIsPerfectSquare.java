package NumberPrograms;

public class FindNumberIsPerfectSquare
{
	public static void main(String[] args)
	{
		int number=16;
		int mul=0;
		boolean a=true;
	
		for(int i=1;i<=number;i++)
		{
			mul=i*i;	
			if(number==mul)
			{
			a=false;
			break;
			}
		}
		if(a==false)
		{
			System.out.println(number +" is perfect square");
		}
		else
		{
			System.out.println(number +"is not perfect square");
		}
		
	}

}
