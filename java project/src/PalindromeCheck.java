import com.bridgelabz.Utility.*;
import java.util.Scanner;

public class PalindromeCheck {
	
	 public static void main(String[] args) {
	
	 String a,b="";
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter The String");
	 a=sc.nextLine();
	  
	  for(int i=a.length()-1;i>=0;i--)
	  {
		  b= b + a.charAt(i);
	  }
	  
	  if(a.equalsIgnoreCase(b))
	  {
		  System.out.println("the string is palindrome");
	  }
	  else
	  {
		  System.out.println(" The String is not palindrome");
	  }
	 }

}
