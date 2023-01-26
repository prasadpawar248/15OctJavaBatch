package OverLoading;

public class ConstructorOverloading 
{
	
	//1.
	public ConstructorOverloading()
	{
		int a=50;
		System.out.println(a);
	}
	
	//2.
	public ConstructorOverloading(int x)
	{
		int b=60;
		System.out.println(b);
	}
	
	//3.
	public ConstructorOverloading(int x, int y)
	{
		int c=70;
		System.out.println(c);
	}
	
	public static void main(String [] args)
	{
		
		ConstructorOverloading obj = new ConstructorOverloading();  //50
		ConstructorOverloading obj1 = new ConstructorOverloading(10);  //60
		ConstructorOverloading obj2 = new ConstructorOverloading(50, 40);  //70
	}
	

}
