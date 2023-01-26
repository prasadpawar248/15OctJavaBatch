package Method1;

public class Child1 extends MethodWithArgs1
{
	public static void main(String[] args)
	{
		
	//Static method with argument
		
		MethodWithArgs1.add(20, 40);  //Normal way to call method
		Child1.add(10, 30);     // Inheritance way
		
	//Static return type method with argument
		
		MethodWithArgs1.add2(10, 20); //normal way to call method
		Child1.add2(20, 30);         // Inheritance way
	//	int z=Child1.add2(20,10);
		
		
	}
}
