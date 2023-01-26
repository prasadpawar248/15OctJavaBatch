package Interface;

public class ImpClass implements InterfaceConcept
{

	@Override
	public void method1() 
	{
	System.out.println("hello");	
		
	}

	@Override
	public void method2() 
	{
	System.out.println("byee");			
	}
	
	public static void main(String[]args)
	{
		ImpClass obj=new ImpClass();
		obj.method1();
		obj.method2();
		
	}

}
