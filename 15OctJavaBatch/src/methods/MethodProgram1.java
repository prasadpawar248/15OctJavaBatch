package methods;

public class MethodProgram1 
{
	
//This is Static methods.
	
//	public static void add()
//	{
//		int a=10;
//		int b=20;
//		System.out.println(a+b);
//	}
	
	public static void main (String[] args)
	{
		
	//1) method can call with method name
//		add();
		
	//2) method can call with class name
//		MethodProgram1.add();
		
		System.out.println("akshay");
		student();
		
		System.out.println("rohit");
		student();
		
		System.out.println("rahul");
		student();
		
		
		
	}
	
	public static void student()
	{
		String cname="abc";
		System.out.println(cname);
		String std ="10th";
		System.out.println(std);
		char div = 'A';
		System.out.println(div);
	}

	public static void add() 
	{
		
		
	}
	

}
