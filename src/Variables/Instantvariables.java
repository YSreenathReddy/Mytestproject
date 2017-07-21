package Variables;

public class Instantvariables 
{
	int a=10;
    char b='b';	
    public void Instantmethod()
    {
    	//Instant variables calling to instant area
    	System.out.println(a+"+b");
    }
 // static area
	public static void main(String[] args) 
	{
		
		Instantvariables i=new Instantvariables();
		//Instant variable calling
		System.out.println(i.a);
		System.out.println(i.b);
		//Instant method calling to static area
        i.Instantmethod();
	}

}