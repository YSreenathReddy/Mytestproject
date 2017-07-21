package MAinMethod;

public class Mainmethodtest1 {

	static public   void main(String[] args) 
	{
		Mainmethodtest1  t=new Mainmethodtest1();
		System.out.println("main method");
		t.main(10);
}
	
	public static void main(int... args)
	{
		System.out.println("over loaded mehod");
		for(int x1:args)
		{
		System.out.println(x1);
		}
	}
}
