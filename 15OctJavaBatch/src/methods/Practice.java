package methods;

public class Practice 
{
	int a=20;
	
	public  Practice ()
	{
		a=30;
		System.out.println(a);
		
	}
	
	public Practice (int x)
	{
		a=40;
		System.out.println(a);
	}
	
	public static void main(String [] args)
	{
		Practice x= new Practice();
		Practice y= new Practice(10);
		
		
	}

}
