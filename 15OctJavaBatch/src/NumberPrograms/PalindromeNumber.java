package NumberPrograms;

public class PalindromeNumber 
{
	public static void main(String [] args)
	{
		int number=343;
		int temp=0;
		int rev=0;
		
		temp=number;
		
		while(temp>0)
		{
			rev=rev*10+temp%10;  //remainder value
			temp=temp/10;        // qutiont value 
		}
		if(rev==number)
		{
			System.out.println(number+" is palindrome number");
		}
		else
		{
			System.out.println(number+" is not palindrome number");
		}
	}

}
