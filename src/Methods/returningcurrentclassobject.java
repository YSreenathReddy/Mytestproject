package Methods;

public class returningcurrentclassobject
{
	//By creating object
	returningcurrentclassobject method1()
	{
		System.out.println("method1");
		returningcurrentclassobject r= new returningcurrentclassobject();
		return r;
		}
	//using this operator
	returningcurrentclassobject method2()
	{
	
		System.out.println("method2");	
		return this;
		
	}

	public static void main(String[] args)
	{
		returningcurrentclassobject r=new returningcurrentclassobject();
		r.method1();
		r.method2();

	}

}
