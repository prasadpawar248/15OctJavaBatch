package StringProgram;

public class FrequencyOfCharInString 
{
	public static void main(String[]args)
	{
		String a="programmingr";
		for(int i=0;i<a.length();i++)
		{
			int count=0;
			boolean value=false;
			for(int k=0;k<i;k++)
			{
				if(a.charAt(i)==a.charAt(k))
				{
				value =true;
				}
			}
			if(value==false)
			{
				for(int j=i;j<a.length();j++)
				{
					if(a.charAt(i)==a.charAt(j))
					{
						count++; //1
					}
				}	
				System.out.print(a.charAt(i)+"="+count+" ");
				
			}
			
		}
	}

}
