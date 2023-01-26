package NumberPrograms;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		int number=sc.nextInt();
		int count=0,remainder=0,temp=0;
		int sum=0;
		
		temp=number;
		while(temp>0)
		{
			//digit=digit+number%10;
			temp=temp/10;
			count++;
		}
		temp=number;
		while(temp>0)
		{
			remainder=temp%10;
			sum=(int) (sum+Math.pow(remainder, count));
			temp=temp/10;
		}
		System.out.println("sum of this number is "+sum);
		if(sum==number)
		{
			System.out.println(number +" this is armstrong number");
		}
		else
		{
			System.out.println(number +" this is not armstrong number");
		}
		
	}

}
