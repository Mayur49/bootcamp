
public class InsertionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String arr[]= {"mz","sn","az","sp"};
       
       String arraysort[]=sort_sub(arr,arr.length);
       
    	for(int i=0;i<arraysort.length;i++)
    	{
    		System.out.println(arraysort[i]);
    	}
	}		
	
	      public static String[] sort_sub(String array[] , int n)
	      {
	       String temp="";
	      
	      for(int i=0;i<n;i++)
	      {
	    	for(int j=i+1;j<n;j++)
	    	{
	    	 if(array[i].compareToIgnoreCase(array[j])>0)
	    	 {
	    		temp=array[i];
	    		array[i]=array[j];
	    		array[j]=temp;
	    	 }
	    	}
	      }
	     return array;
	
	
	
	      }
	
}
