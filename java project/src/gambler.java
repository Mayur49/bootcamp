import java.util.Scanner;

public class gambler {

	public static void main(String[] args) {
		
		int goal,cash,iteration,n;
		float count=0,precentage;
		 
		Scanner sc = new Scanner(System.in);
		
		cash= sc.nextInt();
		
      System.out.println("enter the iteration");
      iteration= sc.nextInt();
		
      System.out.println("enter the goal");
      goal= sc.nextInt();
     
	for(int i=0;i<iteration;i++)
	{
	 	n=(int) Math.random();
		if(n==1)
		{
			cash=cash+50;
			count++;
		}
		else
		{
			cash=cash-50;
		}
	}
	
	
	 
	 if(cash==goal && cash>=goal)
	 {
		 System.out.println("win");
	 }
	 else {
		 System.out.println("loss");
	      
	 }
   float percentage=(count/iteration)*100;
	 
   System.out.println("percentage of wins"+percentage);
	
   System.out.println("percentage of loss"+(iteration-count)/iteration*100);
	
	
	}

}
