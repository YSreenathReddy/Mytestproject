package Staticblocks;

public class Test1
{
	int a;
	String  b;
	static int c;
	static String d;
	
	//Instance block: rurs at object run time
	{
		System.out.println("Instance block");
	}
	// Static block: runs .class runs time
	static
	{
		System.out.println("Static block 1");
	}
	
	void method1()
	{
		System.out.println("instant method");
	}
	static void method2()
	{
		System.out.println("Static method"+c+d);
	}
	

	public static void main(String[] args)
	{
	Test1 t=new Test1();
	t.method1();
	t.method2();
	Test1 t1=new Test1();

	}

}
