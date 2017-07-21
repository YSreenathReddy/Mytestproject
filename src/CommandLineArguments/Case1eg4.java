package CommandLineArguments;

public class Case1eg4 
{

	public static void main(String[] args) 
	{
	//we are creating sting array with string values
   String[] argh={"S","R","E","E"};
   //We are assigning created variable to args of main method
	args=argh;
	
	//We are args values to other varialable to print
	for(String x:args)
	{
		System.out.println(args[0]+args[1].toLowerCase()+args[3].length()+x.toLowerCase());
	
	}}

}
