
public class vendingmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int amt=10523;
       
       int amt1=0,i=0;
       int arr[]= {2000,500,200,100,50,20,10,5,2,1};
       while(amt>0)
       {
    	   amt1=amt/arr[i];
    	   amt=amt%arr[i];
    	  
    	   System.out.println(arr[i]+" "+amt1);
    	   i++;
       }
	}

}
