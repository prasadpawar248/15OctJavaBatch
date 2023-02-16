package Keywords;

public class FinalKeyword {
	
     static final int a=10;
    
    
	  void method1()
	{
//		 a=0;   // we can not change the value of a variable bcoz we used final keywords.
		System.out.println(a);
	}
	
	public static void main(String[]args)
	{
//	  a=20;    we can not change the value of a variable.
	  
	  System.out.println(a);
		
	}

}
