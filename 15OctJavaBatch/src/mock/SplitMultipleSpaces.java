package mock;

import java.util.Arrays;
import java.util.LinkedList;

public class SplitMultipleSpaces {
	public static void main(String[] args) {

		/*	String sentence="cat  and dog";
	      int a=0;
	      String c[]=sentence.split("\s+");
	      String b="abcdefghijklmnopqrstuvwxyz";
	      System.out.println(c.length);
	        for(int i=0;i<c.length;i++) //cat  and dog
	        {
	            int count=0;
	          for(int j=0;j<c[i].length();j++) //cat
	          {
	            for(int x=0;x<b.length();x++)  //abcd
	            {
	                if((c[i].charAt(j))==(b.charAt(x)))
	                {
	                    count++; //3
	                }
	            }
	            System.out.println(count); 
	          }
	          
	          if(count==c[i].length())
	          {
	              a++;
	          }
	        

	        } 
	        System.out.println(a);*/
		
		
		String s="abcabcbb";
		int x=0;
	       for(int i=0;i<s.length();i++)
	       {
	           String p="";
	         
	            for(int j=i;j<s.length();j++)
	            {	
	            	  boolean val=true;
	                 for(int k=0;k<p.length();k++)
	                 {
	                	 if(p.charAt(k)==s.charAt(j))
	                	 {
	                		 val=false;
	                	 }
	                 }
	                if(val==true)
	                {
	                p=p+s.charAt(j);
	                }
	                else
	                {
	                    break;
	                }
	            }
	            if(p.length()>x)
	            {
	                x=p.length();
	            }
	       } 
	}

}
