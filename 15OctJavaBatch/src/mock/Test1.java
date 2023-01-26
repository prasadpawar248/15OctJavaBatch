package mock;

public class Test1 {
	
	public static void main(String[] args)
	{
		String a="abcdefghijklmnopqrstuvwxyz";
		String b="the four boxing wizard starts over the quickly";
		
		for(int i=0;i<a.length();i++)
		{
			boolean value=true;
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
					{
					value=false;
					}
			}
			if(value==true)
			{
				System.out.print(a.charAt(i)+"");
			}
		}

	}

}
