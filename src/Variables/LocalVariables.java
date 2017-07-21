package Variables;

public class LocalVariables 
{
	public void A()
	{
		//Local Variables
		int a=10;
		double b = 3.6;
		char c='z';
		System.out.println(a+""+b+""+c);
	}
	
	public static void main(String[] args)
	{
		LocalVariables lv=new LocalVariables();
		lv.A();
	}

}
