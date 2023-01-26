package pack34;

import pack12.Class1;

public class Class4 
{
	public static void main(String[] args)
	{
		System.out.println(Class1.a);  //10
		Class1.method1();  //20 
		
		Class1 y=new Class1();
		System.out.println(y.c);  //30
		y.method2();  //40
	}

}
