package Variables1;

import Variables.Instantvariables;

public class InstanceVariables 
{
	//Variable should be created outside methods and inside Class
	//Instance Variable: Value of variable will vary from object to object
	//For every object a separate copy will be created
	//We can't access Instance variables directly to  
	
	int x=10;
	int y=20;
	public void m1()
	{
		System.out.println(y-x);
	}
	public static void main(String[] args) 
	{
	InstanceVariables i=new InstanceVariables();
		System.out.println(i.x+i.y);
		i.m1();
	}

}
