 import com.bridgelabz.Utility.*;

import java.util.Scanner;

public class Name {

	 
	public static void main(String[] args) {
	   String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name");
	    	 str=sc.nextLine();
	    	 
		 
		
		
		 if(str.length()<=3)
			System.out.println("hello "+str + " how are u ");
		 else 
			 System.out.println("invalid ");
	}

}
