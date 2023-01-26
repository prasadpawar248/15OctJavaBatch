 package Inheritance;

public class ChildClass extends ParentClass
{
	public void mul()
	{
		System.out.println(x*y);
	}

	public static void main(String[] args)
	{
		ChildClass obj=new ChildClass();
		obj.mul();
		System.out.println(obj.x);
		int z=obj.y;
	}
	
}
