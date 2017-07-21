package Variables;

public class Test1
{
	
	int a;
	float b;
	char c;
	
	void method1(int d,double e)
	{
		System.out.println("the value of local variables are"+(d+e));
		
	}
	static void method2(String x,double d)
	{
		System.out.println("Local variables from static"+x+d);
	}

	public static void main(String[] args) 
	{
	Test1 t=new Test1();
	t.method1(10, 10.2);
	Test1.method2("sreenath", 10.23);
			
		
	}

}
