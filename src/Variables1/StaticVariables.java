package Variables1;

public class StaticVariables 
{
   //Variable should be declared as static when the variable is not varied from object to object
  //Static variable will be created at time of .class file loading and use by remaining
//
	
	static int i=10;
	static float f=20;
	static char c='c';

	
	public static void main(String[] args)
	{
		StaticVariables sv=new StaticVariables();
		sv.StaticToInstantce();
		System.out.println(i);
		int i=20;
		System.out.println(sv.i);
		//Printing static variable
		System.out.println(i);
	}
	
	public void StaticToInstantce()
	{
		System.out.println(i+f+""+  c);
	}
	

}
