
public class harmonic {

	
	static double nHarmonic(int n)
	{
	 float harmonics=1 ;
	 
	for(int i=2;i<=n;i++)
	{
		harmonics=harmonics+  (float)1/i;	
	}
	 return harmonics;
}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=90;
      
     System.out.println( nHarmonic(n));
		
	}

}
