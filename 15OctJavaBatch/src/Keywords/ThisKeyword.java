package Keywords;

public class ThisKeyword 
{
	int num1;  // global variables
	int num2;
	
	void method(int num1,int num2) 
	{
		this.num1=num1;  //local variables- 
		this.num2=num2;  //so how to seperate global and local veriables here we need to use this. keyword.
			
	}
	
	public static void main(String[]args)
	{
		
		ThisKeyword obj=new ThisKeyword();
		
		System.out.println(obj.num1);
		
	}

}
