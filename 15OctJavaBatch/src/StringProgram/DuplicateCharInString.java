package StringProgram;

public class DuplicateCharInString 
{
	public static void main(String[]args)
	{
		String a="programming";
		String value="";
		
		for(int i=0;i<a.length();i++)
		{
			boolean val=true;
			for(int k=0;k<i;k++)
			{
				if(a.charAt(i)==a.charAt(k))
				{
					val=false;
				}
			}
			if(val==true)
			{
				for(int j=i+1;j<a.length();j++)
				{
					if(a.charAt(i) ==a.charAt(j))
					{
						value=value+a.charAt(i)+" ";
						break;
					}
				}
			}
		}
		System.out.println("Duplicate char in strings are: "+value);		
		
	}

}
