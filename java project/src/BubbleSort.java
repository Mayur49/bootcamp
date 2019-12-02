
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str[]= {"mayur","zolekar","sonal","ashu","omiz"};
	String temp;
	
	System.out.println("enter the string in sorted order");
	
	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if(str[j].compareTo(str[i])<0)
			{
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
		}
		System.out.println(str[i]);
	}
	
	
	
	}

}
