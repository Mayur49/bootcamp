import java.lang.reflect.Array;

public class BinaryString {

	static int binarysearch(String arr[], String x)
	{
		int l=0,r=arr.length-1;
		
		while(l<r)
		{
			int m=(l+(r-l))/2;
			int res=x.compareTo(arr[m]);
			
			if(res==0)
			
				return m;
			if(res>0)
			
				l=m+1;
			else
				r=m-1;
			
		}
		return 1;
	}
          
	public static void main(String args[])
	{
		 String arr[]= {"mz","sn","az","sp"};
		 String x="sn";
		 int res= binarysearch(arr,x);
		 if(res== 1) {
			 System.out.println("found");
		 }
		 else {
			 System.out.println("not found"); 
		 }
			
	}
	
	
}
