package Constructor;

public class ConstructorWithArg 
{
	int a;
	int b;
	
//User defined type constructor - 2 types With Argument and Without Argument
	
//1 Const without args.
	
	public ConstructorWithArg()
	{
		a=20;
		b=30;
		System.out.println(a+b);
		
	}
	
//2 Const with args.
	
	public ConstructorWithArg(int x)
	{
		a=x;
		b=20;
		System.out.println(a+b);		
	}
	
//3 Const with 2 args.
	
	public ConstructorWithArg(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	
//4 Const with 3 args.
	
	public  ConstructorWithArg(int y, int x, String p)
	{
		a=y;
		b=x;
		int z=30;
		System.out.println(a+b+z);
		 
	}
	
//5 const with 3 args.
	
	public ConstructorWithArg(int i,char j,String k)
	{
		a=20;
		b=30;
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
	
	//1st const with out arg
		ConstructorWithArg obj=new ConstructorWithArg();  //50
	//2nd const with arg	
		ConstructorWithArg obj1=new ConstructorWithArg(1);  //30
	//3rd const with 2 arg
		ConstructorWithArg obj2=new ConstructorWithArg(1,2); //3
	//4th const with 3 arg
		ConstructorWithArg obj3=new ConstructorWithArg(1,2,"abc");  //33
	//5th const with 3 arg
		ConstructorWithArg obj4=new ConstructorWithArg(1,'a',"abc");  //50
		
		
		
		
	//  ConstructorWithArg obj=new ConstructorWithArg();  from same object name we can not call const.		
	}

}
