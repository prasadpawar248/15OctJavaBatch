package methods;

public class ReturnTypeWithArgStaticMethod 
{
	//With argument return type method
	
		public static int method1(float x)
		{
			int a=40;
			int b=20;
			System.out.println(a+b);
			return 10;
		}
		
		public static void main(String[] args)
		{
			
			method1(10.2f);
//			int z=method1(20.1f);
//			System.out.println(z+10);
		
		}

}
