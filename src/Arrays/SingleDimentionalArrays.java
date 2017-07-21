package Arrays;

public class SingleDimentionalArrays 
{

public static void main(String[] args) 
{
//Array is an indexed collection of fixed number of homogeneous data elements
	//One dimensional Array
	//Integer Array
	int[] x=new int[4];
	x[0]=1;
	x[1]=2;
	x[2]=3;
	x[3]=4;
	for(int i=0;i<x.length;i++)
	System.out.println(x[i]);
	
	//String Array
	String[] s=new String[3];
	s[0]="sreenath";
	s[1]="Sreenivas";
	s[2]="Reddy";
	for(int i=0;i<s.length;i++)
	System.out.println(s[i]);
	
	//Double Array
	double[] d=new double[2];
	d[0]=0;
	d[1]=11.0;
	for(int i=0;i<d.length;i++)
	System.out.println(d[i]);
	
	//char Array
	char[] c=new char[2];
	c[0]='s';
	c[1]='r';
	for(int i=0;i<c.length;i++)
	System.out.println(c.length);
	
}}
