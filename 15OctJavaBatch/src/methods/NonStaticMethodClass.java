package methods;

public class NonStaticMethodClass 
{
	int a;
	int b;
	
	public void add()
	{
		a=50;
		b=40;
		System.out.println(a+b);
	}
	
	public void sub()
	{
		a=60;
		b=30;
		System.out.println(a-b);
	}
	
	public static void main(String[] args)
	{
		NonStaticMethodClass abc = new NonStaticMethodClass(); //from same object name we can call multiple non static method
		abc.add();
		abc.sub();
		abc.add();
				
		NonStaticMethodClass abc1 = new NonStaticMethodClass(); //from multiple object name we can call multiple non static method
		abc1.add();
		abc1.sub();
		
		
	}

}
