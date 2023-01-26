package Interface;

public interface InterfaceConcept
{	

	
	//to provide 100% abstraction interface is used.
	//100% abstract(incomplete) in nature.
	//it is not a class
	//here is no such static/non static concept
	
	
	public abstract void method1();   // this are the two way to write methods 
					void method2();
					
					
	public static void main(String[] args)
	{
		
		// we can not create object of interface becoz this is not a class & there are incomplete methods
		//InterfaceConcept obj=new InterfaceConcept();
		
	}
	
}
