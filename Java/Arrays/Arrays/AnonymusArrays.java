package Arrays;

public class AnonymusArrays 
{
	public static void main(String[] args)
	{
//Anonymous Arrays
		
		sum(new int[]{1,2,3,4});
		
	}
	
	public static void sum(int[] x)
	{
		int Total=0;
		for(int x1:x)
		{
			Total=Total+x1;
	}
		System.out.println(Total);
	}
}
