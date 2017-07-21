package Constructors;

public class Parametrisedconstructorswiththiskeyword 
{
	int empid;
	String Empname;
	String dept;
	
	Parametrisedconstructorswiththiskeyword(int empid,String Empname,String dept)
	{
		//Converting variables form local to instance
		this.empid=empid;
		this.Empname=Empname;
		this.dept=dept;
	}
	void display()
	{
		System.out.println("Emp id is"+empid);
		System.out.println("Emp name is"+Empname);
		System.out.println("Emp dept is"+dept);
	}

	public static void main(String[] args)
	{
Parametrisedconstructorswiththiskeyword p=new Parametrisedconstructorswiththiskeyword(10, "sreenath", "ECE");
p.display();
Parametrisedconstructorswiththiskeyword p1=new Parametrisedconstructorswiththiskeyword(10, "JP", "ECE");
p1.display();

	}

}
