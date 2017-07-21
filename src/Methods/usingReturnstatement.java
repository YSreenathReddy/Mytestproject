package Methods;

public class usingReturnstatement
{
/*int method()
{
	//wrong declaration
}*/

int A(int x)
{
	System.out.println(x);
	return 20;
}
Example1 method2()
{
	System.out.println("m2");
	Example1 e=new Example1();
	return e;
}

static String method3()
{
	System.out.println("m3 method");
	return "sreenath";
}


public static void main(String[] args) 
	{
usingReturnstatement r=new usingReturnstatement();
//r.A(10);
Example1 e=r.method2();
int x=r.A(10);
String y=r.method3();





	}

}
