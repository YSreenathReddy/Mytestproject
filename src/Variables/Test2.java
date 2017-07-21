package Variables;

public class Test2
{
    static int a;
	float b;
	static String c="Sreenath";
	
	void method1()
	{
		int a=10;
		float b=10.2f;
		System.out.println(c);
		System.out.println("the value of local variables are"+a+b+c);
	}
	static void method2()
	{
		System.out.println("static valiable"+c);
		Test2 t=new Test2();
		System.out.println(t.a);
		System.out.println(t.b);
	}
	void method3()
	{
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
	Test2 t=new Test2();
	t.method1();
	Test2.method2();
	t.method3();
	
	
	
		
	}

}
