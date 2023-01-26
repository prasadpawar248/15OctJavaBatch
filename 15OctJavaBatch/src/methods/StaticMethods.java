package methods;

public class StaticMethods 
{
	//This is Static methods.
	
		 static public void add1()
		{
			
		//Non return type static method - data type is void only
			
			int a=10;
			int b=20;
			System.out.println(a+b);
		}
		
		  static public void main (String args[])
		{
			
		//1) method can call with method name
			add1();
			
		//2) method can call with class name
			StaticMethods.add1();
		}

}
