package MAinMethod;


class Inheritencethroughtmainmethod 
{
	public Inheritencethroughtmainmethod(int... i)
	{
		System.out.println("static block"+i);
	}
	public static void main(String[] args) 
	{
		System.out.println("parent method");
		Inheritencethroughtmainmethod m=new Inheritencethroughtmainmethod();

	}
	
}

class inheritence1 extends Inheritencethroughtmainmethod
{
	public inheritence1(int i) 
	{
		super(i);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		System.out.println("parent method");
		Inheritencethroughtmainmethod m=new Inheritencethroughtmainmethod();

	}
	
}