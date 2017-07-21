package Methods;

public class Example1 
{
	int a=10;
	float b=10.5f;
	char c='x';
	void method1(int x,int y)
	{
		//calling instance variables to instance method
		x=10;
		b=10.5f;
		System.out.println(a+""+b+""+c+""+x);
	}
	static void method2(int x,int y)
	{
		//calling instance variables to static 
		Example1 e=new Example1();
		//calling instance variables and printing that
		System.out.println(e.a+e.b+e.c);
		
	}
	
}
