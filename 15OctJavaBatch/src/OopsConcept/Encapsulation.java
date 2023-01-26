package OopsConcept;

public class Encapsulation extends abc
{
	public static void main(String []args)
	{
		Encapsulation obj=new Encapsulation();
		
		obj.set(10);
		int b=obj.get();
		System.out.println(b);
	}

}

 class abc
{
	private int num;
	
	public void set(int num1)
	{
		num=num1;
		
	}
	
	public int get()
	{
		return num;
	}

}