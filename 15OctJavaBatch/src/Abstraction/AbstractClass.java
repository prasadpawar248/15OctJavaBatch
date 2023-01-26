package Abstraction;

public abstract class AbstractClass 
{
	
//in abstract class both complete and incomplete method can write. i.e. 50% abstract class
	
	public abstract void method1(); //abstract non static method-- i.e. incomplete method
	public void method2()  //   reguler non staric method -- i.e. complete method
	{
		System.out.println("complete method in abstract class");
	}
	
	
	public static void main(String [] args)
	{
	
	// we can not call method in abstract class	
	//	AbstractClass obj=new AbstractClass(); 
		
	}

}
