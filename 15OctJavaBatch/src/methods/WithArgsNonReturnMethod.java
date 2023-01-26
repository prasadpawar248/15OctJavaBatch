package methods;

public class WithArgsNonReturnMethod 
{
	
//without argument non return type static method
	
	public static void add()
	{
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	
//with argument non return type method
	
	public static void method1(int x)
	{
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void method2(String u, char v)
	{
		int a=40;
		int b=20;
		System.out.println(a+b);
		System.out.println("hello");
	}

	public static void main(String [] args)
	{
		add();
		method1(4);  // method with argument  //30
		method2("abc",'h');  // 60 hello
		
	}
}
