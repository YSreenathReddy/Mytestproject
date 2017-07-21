package Variables1;

public class Varargmethod 
{
	
	//Declaration of var arg parameter
	//Case 1: We can define var arg parameter with not normal parameter
	public void case1(int x,int... x1)
	{
		
	}
// Case 2: While mixing var arg parameter with normal parameter we should define var arg parameter in the last place as below
	
//Case 3: Inside method we can able declare only one var arg method
	
	public void case2(String x, char...y)
	{
		
	}
	
//Case 4: Inside var arg method we can also define var arg method as single dimensional array
	
	public void case4(char[] y)
	{
		
	}
	
	
	
	
	public  void m(int...  x)
	{
	System.out.println(x[0]+x[1]+x[2]);
	System.out.println("var arg method");
	}
	public static void main(String[] args) 
	{
	Varargmethod v= new Varargmethod();
	//v.m();
	//v.m(10);
	v.m(10,20,30);
	v.sum(10);
	v.sum(10,20);
	v.sum(10,20,30);
	
	}
	
	public static void sum(int... x)
	{
		int total=0;
		for(int x1:x)
		{
			total=total+x1;
		}
		System.out.println(total);
	}

}
