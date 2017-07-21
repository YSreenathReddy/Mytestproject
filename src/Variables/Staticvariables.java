package Variables;

public class Staticvariables 
{
   static int a=10;
   static int b=20;
   static char x='x';
   
   //Instant area
   void Instantmethod()
   {
	   Staticvariables s=new Staticvariables();
	   System.out.println(s.a+","+s.b+","+s.x);
	   
   }
	public static void main(String[] args) 
	{
		// Static variables calling into static area
		System.out.println(Staticvariables.a+","+Staticvariables.b+","+Staticvariables.x);
		Staticvariables s=new Staticvariables();
		s.Instantmethod();
	}

}

