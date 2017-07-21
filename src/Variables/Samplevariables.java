package Variables;

public class Samplevariables 
{
	int a= 10;
	int b=10;
	static int c=20;
	static int d=20;
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Samplevariables.c+""+Samplevariables.d);
	}
	static void m2()
	{
		Samplevariables s=new Samplevariables();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(Samplevariables.c+""+Samplevariables.d);
	}

	public static void main(String[] args) 
	{
		Samplevariables s=new Samplevariables();
		s.m1();
		s.m2();

	}

}
