package Methods;

public class Methosusingthisparator 
{
	int x=10;
	int y=10;
	
	void method1(int x,int y)
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}
	static void method2(int x,int y)
	{
		// Inside static area is not allowed 
		System.out.println(x+y);
		//System.out.println(this.x+this.y);
	}

	public static void main(String[] args)
	{
	Methosusingthisparator m= new Methosusingthisparator();
	m.method1(1000,2000);
	

	}

}
