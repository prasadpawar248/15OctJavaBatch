package Keywords;

class ASuper
{
	int num=10;
}

class Bsub extends ASuper
{
	void method()
	{
		int num=20;
		
		System.out.println(super.num);
	}
}

public class SuperKeyword 
{

	public static void main(String[]args)
	{
		Bsub obj=new Bsub();
		
		obj.method();
		
	}

}



