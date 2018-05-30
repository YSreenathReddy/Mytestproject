package OOPS;

public abstract class Abstraction 
{
	/*//Defn: Hiding of internal implementation and highlighting set of services what we are offering
	 Advantages: 1. Security
	             2. Enhancement is easy
	             3. Easy to access
	             
	             
	  By using interface and abstract classes we can implement abstraction
*/	public void m1()
{
	System.out.println("non abstract method");
}
	 
public abstract void m2();
	public static void main(String[] args) 
	{
		
		Abstraction2 a=new Abstraction2();
		a.m1();
		a.m2();

	}

}

class Abstraction2 extends Abstraction
{
	public void m2()
	{
		System.out.println("Implementation method of abstract method");
	}
		
}
