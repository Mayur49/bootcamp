import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[])
    {
    	String s1,s2;
    	int i;
    	int found=0,not_found=0;
    	
    	Scanner sc=new Scanner(System.in);
    	  
    	  System.out.println("enter the first string ");
  	  
    	    s1= sc.nextLine(); 
    	  
    	    System.out.println("enter the second string ");
    	    s2= sc.nextLine(); 
    	
    	if(s1.length() != s2.length())
    	{
    		 System.out.println("enter the proper string ");
    	}
    	for( i=0;i<s1.length();i++)
    	{
    		found=0;
    	}
    	for(int j=0;j<s2.length();j++)
    	{
    		if(s1.charAt(i) == s2.charAt(j))
    		{
    			found=1;
    			break;
    		}
        
    	
    	
    	if(found==0)
    	{
    		not_found=1;
    		break;
    	}
    	}
	if(not_found==1)
	{
		 System.out.println("string are not equal");
		 
	}
	else
	{
		 System.out.println(" string are equal ");
	}
    }	
}
