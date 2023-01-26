package mock;

public class Program2 
{
	public static void main(String[] args) {
		
		String a="PROGRAMMING";
		
		for(int i=0;i<a.length();i++)
		{
			int count=0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(i)==(a.charAt(j)))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(a.charAt(i)+" ");
			}
		}
		
	}

}
