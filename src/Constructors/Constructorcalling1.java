package Constructors;

public class Constructorcalling1 
{
	
	public Constructorcalling1()
	{
		this(10);
		System.out.println("0 argument");
	}
	public Constructorcalling1(int a)
	{
		this(10,20);
		System.out.println("1 argument");
	}
	public Constructorcalling1(int b,int c)
	{
		System.out.println("2 argument");
	}
	public static void main(String[] args)
	{
		Constructorcalling1 c=new Constructorcalling1();
		

	}

}
