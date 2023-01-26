package pack12;

public class Class2 
{
	public static void main (String [] args)
	{
		
		
	//to call static var and method
		
	System.out.println(Class1.a);
	Class1.method1();
	
	// to call non static var. and method
	
	Class1 x=new Class1();
	
	System.out.println(x.c);
	x.method2();
	
		
	}
	
}
