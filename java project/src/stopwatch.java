import java.util.Scanner;

public class stopwatch {
  
	 static double start=0,stop=0;
	  
	 static void startTime()
	  {
		  start=System.currentTimeMillis();
		  System.out.println("Started at" +start);
	  }
	 
	 static void stopTime()
	 {
		 stop=System.currentTimeMillis();
		 System.out.println("stoped at" +stop);				 
	 }
	  static void elapsedTime()
	  {
		  System.out.println("elapsed time" +(stop-start)/1000);
	  }
	
	
	
     public static void main(String[] args) {
		 
    	 Scanner sc=new Scanner(System.in);
    	 
    	 System.out.println("Enter 1 To Start ");
    	 sc.next();
    	 startTime();
    	 
    	 System.out.println("stop time");
         sc.nextInt();    	 
    	 stopTime();
    	 
    	 elapsedTime();
	}

}
