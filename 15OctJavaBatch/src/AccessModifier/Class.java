package AccessModifier;

public class Class 
{
	public static int a=10;     // public mean we can used this var to poject
	//private static int a=10;  // private mean we can used this var to only this class
	//static int a=10;          // default mean we can used this var to only this package
	//Protected int a=10;       // protected mean we can used this var to only package.
	
	private static void method()  // private mean we can used this method to only this class
	{
		int b=20;
		System.out.println(b);
	}
	
	static void method1()  // default mean we can used this method to only this package
	{
		System.out.println("hello");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(a);  //10
		
		Class.method();  //20

		
		int c=20;
		double d=20.0;
		
		if(c==d)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
		
	}
	


}
