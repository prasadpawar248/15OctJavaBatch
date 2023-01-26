package Inheritance;

public class ParentClass  
{
	 int x=20;
	 int y=30;
	
	protected void add()
	{
		
		System.out.println(x+y);
	}
	
	public static void main(String [] args)
	{	
		ParentClass obj=new ParentClass();
		obj.add();
//		obj.sub();
		
//		GrandParentClass obj1=new GrandParentClass();
//		obj1.sub();
	}
	
}
