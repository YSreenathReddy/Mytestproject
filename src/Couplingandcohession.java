
 class Couplingandcohession 
{
	 public static void main(String[] args)
	 {
		  int n=A.l;
		  System.out.println(n);
	 }
}
	 class A
		{
        static int l=B.k;
			
		}
		class B
		{
			
			static int k=c.k;
			
		}
		
		class c
		{
	  static int k=d.m1();
		}
		class d
		{
		    public static int  m1()
			{
			 return 10;
			}
		}
	
