package Instanceblocks;

public class Instantblocktest1 
{
	int a;
	Instantblocktest1()
	{
		System.out.println(" Instance block with out arguments");
	}
	//User defined constructor with 0 argument
	 Instantblocktest1(int a)
	{
		this.a=10;
		System.out.println("Instant constructor"+a);
	}
	//User defined constructor with 1 argument
	 Instantblocktest1(String x,String y)
	 {
		 System.out.println("1 argument"+(x+y));
		 
	 } 
	 //Static block
	 static
	 {
		 System.out.println("static block");
	 }
	//Instance block
	 {
		a=10;
		System.out.println("instant block"+a);
	}
// Instance method
	void m1(int a)
	{
		// assigning a value to instant variable using this operator
		this.a=10;
		System.out.println("instant method"+a);
		
	}
	//Static method
	static String method2(String x)
	{
		Instantblocktest1 t=new Instantblocktest1();
				int a=10;
		System.out.println("test");
		return "sreenath";
	}
	public static void main(String[] args)
	{
	Instantblocktest1 i=new Instantblocktest1();
	i.m1(10);
	i.method2("sreenath");
	Instantblocktest1 i1=new Instantblocktest1();
	//Instantblocktest1.method2("sri");
	
	}

}
