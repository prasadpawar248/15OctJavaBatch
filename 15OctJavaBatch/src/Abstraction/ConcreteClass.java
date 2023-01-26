package Abstraction;

public class ConcreteClass extends AbstractClass
{

	@Override
	public void method1()  // this is incomplete method we have completed in this class.
	{
		System.out.println("incomplete method in abstract class");
		
	}
	
	public static void main(String[]args)
	{
		
		ConcreteClass obj=new ConcreteClass();
		obj.method1();
		obj.method2();
		
	}
	

}
