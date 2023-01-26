package Constructor;

public class Constructor 
{
	int a;
	public  Constructor()
	{
		a=20;
		System.out.println(a+10);
		
	}
	
	public static void main(String[] args)
	{
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor();
	}

}
