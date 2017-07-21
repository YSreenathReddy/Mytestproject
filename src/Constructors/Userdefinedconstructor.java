package Constructors;

public class Userdefinedconstructor 
{
	// o argument constructor
	Userdefinedconstructor()
	{
		System.out.println("0 args constructor");
	}
	Userdefinedconstructor(int a)
	{
		System.out.println("1 args constructor"+a);
	}
	Userdefinedconstructor(int b,int c)
	{
		System.out.println("2 args constructor"+(b+c));
	}
	
	void method1()
	{
		System.out.println("method1");
	}

	public static void main(String[] args) 
	{
	Userdefinedconstructor u=new Userdefinedconstructor();
	Userdefinedconstructor u1=new Userdefinedconstructor(10);
	Userdefinedconstructor u2=new Userdefinedconstructor(20, 30);
	u.method1();
	u1.method1();
	u2.method1();

	}

}
