package ArrayProgram;

public class SecondLargestNumberInArray 
{
	public static void main(String []args)
	{
	int a[]={8,4,2,3,5,6,7,8,9};
	
	int fnum=0;
	int snum=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>fnum)
		{
			snum=fnum;  //2
			fnum=a[i]; //1
		}
		else if(a[i]>snum)
		{
			snum=a[i]; //2
		}
	}
	System.out.println("Second largest number is: "+snum);
	
	//------------second lesser no.-------------//
	
	int b[]={8,4,3,2,5,6,7,1,9};
	
	int lnum=b[0];
	int slnum=b[0];
	for(int i=0;i<b.length;i++)
	{
		if(b[i]<lnum)
		{
			slnum=lnum;  //2
			lnum=b[i]; //1
		}
		else if(b[i]<slnum)
		{
			slnum=b[i]; //2
		}
	}
	System.out.println("Second lesser number is: "+slnum);

	
	}

}


