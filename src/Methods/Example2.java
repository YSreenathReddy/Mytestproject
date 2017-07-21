package Methods;

public class Example2
{
	Instancemethods I;
	void method1(Example1 e)
	{
		int x=I.method1();
		//Instancemethods I=new Instancemethods();
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println(x);
		
		
	}

	public static void main(String[] args)
	{
     Example2 eg1=new Example2();
     Example1 eg=new Example1();
     eg.method1(10, 20);
     System.out.println(eg1.I.method1());
    
    
	
	}

}
