package pack12;

public class Class5 {
	
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

}
