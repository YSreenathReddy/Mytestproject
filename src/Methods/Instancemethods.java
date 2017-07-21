package Methods;

public class Instancemethods 
{
	
	int method1()
	{
		System.out.println("method1");
		return method1();
	}
	void method2()
	{
		System.out.println("method2");
	}

	public static void main(String[] args)
	{
		Instancemethods I=new Instancemethods();
		I.method1();
		I.method2();
	}

}
