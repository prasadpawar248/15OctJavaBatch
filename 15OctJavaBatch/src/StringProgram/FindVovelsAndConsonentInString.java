package StringProgram;

public class FindVovelsAndConsonentInString 
{
	public static void main(String[]args)
	{
		String b="programming";
		String c="aeiou";
		int vovels=0,consonent=0;
		
		for(int j=0;j<b.length();j++)
		{
			boolean value=false;
			for(int k=0;k<c.length();k++)
			{
				if(b.charAt(j)==c.charAt(k))
				{
					value=true;
				}
		
			}
			if(value==true)
			{
				vovels++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("Vovels: "+vovels);
		System.out.println("Consonent: "+consonent);
		
		
	//Print Vovels and consonent from string
		
		/*String b="programming";
		String c="aeiou;";
		String vovels="",consonent="";
		
		for(int j=0;j<b.length();j++)
		{
			boolean value=false;
			for(int k=0;k<c.length();k++)
			{
				if(b.charAt(j)==c.charAt(k))
				{
					vovels=vovels+b.charAt(j);
					value=true;
				}
			}
			if(value==false)
			{
				consonent=consonent+b.charAt(j);
			}
		}
		System.out.println("Vovels: "+vovels);
		System.out.println("consonent: "+consonent);*/
		
	}

}
