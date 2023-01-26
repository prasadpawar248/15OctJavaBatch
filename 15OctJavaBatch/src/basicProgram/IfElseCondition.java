package basicProgram;

public class IfElseCondition 
{
	public static void main(String[] args)
	
	{
		

	//if else condition
		
	/*	int number=18;
		
		if(number>=0)
		{
			System.out.println("number is  + ve");
		}
		else
		{
			System.out.println("number is -ve");
		}
	
	//if else if condition
		
		//a student got 65 marks so check which grade he got.
		
		int marks=80;
		
		if((marks>=80) && (marks<=100))
		{
			System.out.println("student got A grade");
		}
		else if((marks>=60) && (marks<80))
		{
			System.out.println("student got B grade");
		}
		else if((marks>=40) && (marks<60))
		{
			System.out.println("student got C grade");
		}
		
		
		else
		{
			System.out.println("student is failed");
		}
		
	//Nested if else condition
		
		int age=18;
		int weight=60;
		
		if(age>=18)
		{
			System.out.println("please check your wt");
			
			if(weight>60)
			{
				System.out.println("you are eligible for blood donation");
			}
			else
			{
				System.out.println("not eligible bcoz your weight");
			}
		}
		else
		{
			System.out.println("not eligible for blood donate bcoz your age");
		}
		
		int a[]= {50,30,40,20,70};
		
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>40)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("student is passed");
		}
		else
		{
			System.out.println("student is failed");
		}*/
		char x='*';
		for(int i=0;i<5;i++)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print(x);
			}
		System.out.println();
		}
		
		
		
	
	}
	

}
