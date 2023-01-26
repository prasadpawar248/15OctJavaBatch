package pack34;

import pack12.Class1;
//import pack12.Class1;
import pack12.Class5;

public class Class3 
{
	public static void main(String [] args)
	{
		
	//to call static var and method
		
		System.out.println(Class5.a);  //10
		Class1.method1();  //20
		
	//to call non static var and method
		
		Class1 x=new Class1();  
		
		System.out.println(x.c);  //30
		x.method2();  //40
		
	}

}
