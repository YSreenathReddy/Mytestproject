package DeclarationsAndAccessModifiers;
/*Abstract class:
 * 1. We cann't create object to the abstract class
   2. If we define any method inside class we must define abstract modifier to the class. Otherwise we will get compile time error because
      method is abstract and class is not abstract then we create Object to class this abstract methods also will come 
   3. abstract class can contain 0 to infinite no.of abstract methods
   4. final and abstract modifiers cannot declare together. If we define together we will get compile time error because 
 		a> Final methods we cann't override but me must override abstract methods. So these modifiers cann't come together
  		b> We cann't create child classes for Final classes but we can able to create child class for abstract class 
  */


abstract class AbstractClass
/*abstract and final combination for classes is illegal because 
1. for final classes we cann't create child classes and we cann't re use methods which are available inside final class
2. for abstract class we must create child class to implement abstract methods  */
{
	/*abstract and final combination for methods is illegal because 
	1. final methods we cann't override in child classes but abstract methods will not implement in parent class,we will create child class and we will override this abstract method in child class*/
	
	abstract void m2();
	public static void main(String[] args) 
	{
		AbstractClass c=new childclasss();
		c.m2();
	
	}

	}

class childclasss extends AbstractClass
{
	void m2() 
	{
	System.out.println("Impleted method of abstract method");	
	}
	
}

