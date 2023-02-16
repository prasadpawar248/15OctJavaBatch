package mock;

public class Program3 
{
	public static void main(String[] args) {
		

		int x=2147395599;
	      int sqrt=0;
	      for(int i=1;i<=x;i++)
	      {
	    	  int j=i*i;
	          if(j==x)
	            {
	                sqrt=i;
	                break;
	            }
	            else if(j<x)
	            {
	                sqrt=i;
	            }
	      }
	      System.out.println(sqrt);
	}

}
