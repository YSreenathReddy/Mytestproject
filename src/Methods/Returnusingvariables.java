package Methods;

public class Returnusingvariables 
{
	int method1(int a)
	{
		System.out.println("method 2");
		//return local variable
		return a;
	}
	
	int b=100;
	int method2()
	{
		//return instance variable when local variable is not defined
		return b;
	}
	
	int c=200;
	int method3(int d)
	{
		//return instance variable using this operator when local variable is defined 
		System.out.println("method 3");
		return this.c;
	}
	
	public static void main(String[] args) 
	{
	Returnusingvariables r=new Returnusingvariables();
	r.method1(10);
	r.method2();
	r.method3(20);
	
		

	}

}
