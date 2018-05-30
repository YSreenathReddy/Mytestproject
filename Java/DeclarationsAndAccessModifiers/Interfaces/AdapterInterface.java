package DeclarationsAndAccessModifiers.Interfaces;


/*Adapter  classes: After creating interface if it contains 1000 methods,the methods which are available in the class may useful or may not. So 
this process is not recommended So
1. We can create one dummy implementation class as below with blank implementation as abstract class and we can extend that
2.  we can override this methods where ever we want by extending that class
*/
interface AdapterInterface 
{
	
	public void m1();
	public void m2();
	public void m3();
	public void m4();

}


 abstract class DummyImplementationclass implements AdapterInterface
{
	public void m1()
	{
		
	}
	public void m2()
	{
		
	}
	public void m3()
	{
		
	}
	public void m4()
	{
		
	}
}
 
 class implemetationclass extends DummyImplementationclass
 {
	 public void m1()
	 {
		 System.out.println("Over ride method of m1");
	 }
	 
	 public void m2()
	 {
		 System.out.println("Over ride method of m2");
	 }
	 
 }
