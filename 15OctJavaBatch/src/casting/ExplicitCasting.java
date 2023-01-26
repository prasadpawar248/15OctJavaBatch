package casting;

public class ExplicitCasting
{
	public static void main(String[]args)
	{
		//we can change data type from higher to lower - double, float, long, int, short, byte.
		
		double a=10.55;
		int b=(int)a;
		System.out.println("double to int casting: "+b);  //10
		
		float c=25.77f;
		int d=(int)c;
		System.out.println("float to int casting: "+d);
		
		int x=20;
		byte y=(byte)x;
		System.out.println("int to byte: "+y);
	}

}
