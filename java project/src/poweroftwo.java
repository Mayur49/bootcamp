import com.bridgelabz.Utility.*;
import java.util.Scanner;

public class poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 double i,n,m;
		 Scanner sc=new Scanner(System.in);
		 
		 
		 System.out.println("Enter the any number");
		  n=sc.nextInt();
		  for(i=0;i<n;i++)
		  {
			  m=Math.pow(2,i);
		  }
			 System.out.println("power of 2 is" +Math.pow(2,i));
	}

}
