package NumberPrograms;

public class ArmstrongNumberOf3digit 
{
	public static void main(String[] args)
	{
		int number=371;  
		int temp=number;
		int rev=0;
		int sum=0;
		
		while(temp>0)
		{
			rev=temp%10;
			sum=sum+(rev*rev*rev);
			temp=temp/10;
		}
		System.out.println("Sum of this number is: "+sum);
		if(sum==number)
		{
			System.out.println(number+" is armstrong number");
		}
		else
		{
			System.out.println(number+" is not armstrong number");
		}
	}

}
