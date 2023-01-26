package pack12;

public class Class1 
{
	
//static variable and method
	
	public static int a=10;     // public mean we can used this var to poject
	//private static int a=10;  // private mean we can used this var to only this class
	//static int a=10;          // default mean we can used this var to only this package
	//Protected int a=10;       // protected mean we can used this var to only package.
	
	public static void method1()
	{
		int b=20;
		System.out.println(b);
	}
	
//non static variable and method
	
	public int c=30;  
	
	
	public void method2()  
	{
		int d=40;
		System.out.println(d);
	}
	
	
	public static void main(String [] args)
	{
		
	//to call static var and method
		
		System.out.println(a);  //10
		System.out.println(Class1.a);  //10
		method1();  //20
		Class1.method1();  //20
		
	//to call non static var and method
		
		Class1 x= new Class1();
		
		System.out.println(x.c);  //30
		x.method2();  //40
		
		
		
		
		
		
		
	}
	

}
