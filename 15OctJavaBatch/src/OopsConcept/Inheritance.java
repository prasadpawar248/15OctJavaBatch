package OopsConcept;

public class Inheritance 
{
	
	public static void main(String[] args)
	{
		child par=new child();
		par.add();
		par.mul();
	}

}
 class parent
{
	int a=20;
	int b=30;
	
	void add()
	{
		System.out.println(a+b);
	}
	
}

 class child extends parent
 {
	void mul()
	{
		 System.out.println(a*b);
	}
 }
