package ArrayProgram;

public class RepetedNumberInArray
{
	
	public static void main(String [] args)
	{
	int a[]={1,2,3,1,2,4,1,5,7,8,4};
	
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		boolean value=true;
		for(int k=0;k<i;k++)
		{
			if(a[i]==a[k])
			{
				value=false;
			}
		}
		if(value==true)
		{
		for(int j=i;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		System.out.println(a[i]+"="+count);	
		}
	}
}
}