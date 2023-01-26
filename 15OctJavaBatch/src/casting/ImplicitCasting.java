package casting;

public class ImplicitCasting 
{
	public static void main(String[]args)
	
	{
		
	//we can change data type from lower to higher - byte, short, int, long, float, double. 
		
		
		byte i=10;
		byte j=20;
	//	byte k=i+j;  not possible bcoz casting issue. 
		
		byte a=10;		
		int b=(int)a;		
		System.out.println("byte to int casting: "+b);    //10
		
		int c=10;   //10
		double d=(double)c;
		System.out.println("int to double casting: "+d);  //10.0
		
		int x=50;
		float y=(float)x;
		System.out.println("int to float casting: "+y);   //50.0
		
	
		  
	}

}
