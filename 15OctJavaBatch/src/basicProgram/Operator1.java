package basicProgram;

public class Operator1 
{
	public static void main(String [] args)
	{
		
	//	Assignment operator	
		
		int a=100;
		int b=150;
		
	// Arithmetic operators
		
		System.out.println(a+b);  // 250
		System.out.println(a-b);  //-50
		System.out.println(a*b);  // 15000
		System.out.println(a/b);  // 0  quotient
		System.out.println(a%b);  // 100 Remainder value
		
	// Relational operator
		
		System.out.println(a==b);  //False
		System.out.println(a>b);   //True
		System.out.println(a<b);   //false
		System.out.println(a<=b);  //false
		System.out.println(a>=b);  //true
		System.out.println(a!=b);  //true
	
	// Increment/decrement operator
		
		a++; //101
		System.out.println(a);
		a++; //102
		System.out.println(a);
		
		a--; //101
		System.out.println(a);
		
	//logical operator
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println( !x );
		
		
		
	
		
	}
	

}
