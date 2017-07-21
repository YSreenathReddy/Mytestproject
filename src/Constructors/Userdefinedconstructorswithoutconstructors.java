package Constructors;

public class Userdefinedconstructorswithoutconstructors
{
	int empid;
	String Empname;
	String dept;
	void display()
	{
		System.out.println("Emp id is"+empid);
		System.out.println("Emp name is"+Empname);
		System.out.println("Emp dept is"+dept);
	}
	Userdefinedconstructorswithoutconstructors ()
	{
		empid=111;
		Empname="sreenath";
		dept="IT";
		
		
	}

	public static void main(String[] args) 
	{
		Userdefinedconstructorswithoutconstructors u=new Userdefinedconstructorswithoutconstructors();
		u.display();
		 
	}

}
