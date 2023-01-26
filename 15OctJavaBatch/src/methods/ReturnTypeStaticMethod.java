package methods;

public class ReturnTypeStaticMethod
{
	//Return type static method --data type for return type is
	//int, long, char, String, boolean
	
	public static int addition()
	{
			int a=20;
			int b=30;
			int c=a+b;
			System.out.println(c);
			return c;
		}
		
		public static void main(String[] args)
		{
			//addition();
			int z=10+addition();
			System.out.println(z);
			System.out.println(20+addition());
		}

}
