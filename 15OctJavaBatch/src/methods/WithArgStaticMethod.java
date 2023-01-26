package methods;

public class WithArgStaticMethod 
{
	public static void method1(int x,int y)
	{
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		method1(10,20);
	}

}
