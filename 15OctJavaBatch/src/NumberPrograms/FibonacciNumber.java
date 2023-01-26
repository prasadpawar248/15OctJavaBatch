package NumberPrograms;

public class FibonacciNumber 
{
	public static void main(String[] args)
	{
		int a=1, b=0, sum=0;
	//	String num="";
		for(int i=1; i<=10;i++)
		{
			sum=a+b;
			//num=num+" "+sum;
			a=b;
			b=sum;
			System.out.print(a+" ");
//			if(i<10)
//			{
//				System.out.print(",");
//			}
		}
		
		
	}

}
