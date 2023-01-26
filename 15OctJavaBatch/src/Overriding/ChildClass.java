package Overriding;

public class ChildClass extends ParentClass
{
	
	
	public void addition()
	{
		int a=10;
		int b=40;
		System.out.println(a+b);
	}

	
	
	
	public static void main(String[]args)
	{
		ChildClass obj=new ChildClass();
		obj.addition();  // method overriding
		
//		ParentClass obj1=new ParentClass();
//		obj1.addition();;
	}

}
