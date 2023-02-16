package mock;

public class StringArraySort 
{
	public static void main(String []args)
	{
		String a[]= {"zaba","rahul","akshay","komal","rohit","vijay","mahesh"};
		String b="abcdefghijklmnopqrstuvwxyz";
		String c="";
		for(int i=0;i<b.length();i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b.charAt(i)==a[j].charAt(0))
				{
					c=c+a[j]+" ";
				}
			}
		}
		System.out.println(c);
	}

}
