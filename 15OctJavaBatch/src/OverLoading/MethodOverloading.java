package OverLoading;

public class MethodOverloading 
{
	
	int a=20;
	
//1.
	public  int method()
	{
		
		System.out.println("hii");
		return 10;
	}

//2.
	public  void method(int x)
	{
		System.out.println("hello");
	}
		
//3.
	public  void method(int x, char a)
	{
		System.out.println("bye");
	}
		
	public static void main(String[] args)
	{
//		method();       //hii
//		method(10);     //hello
//		method(5,'a');  //bye
		MethodOverloading x=new MethodOverloading();
		x.method();
		x.method(10);
		x.method(5,'a');
		
	}

	
}
