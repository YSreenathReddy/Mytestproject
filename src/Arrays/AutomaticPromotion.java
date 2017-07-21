package Arrays;

public class AutomaticPromotion {

	public static void main(String[] args) 
	{
	byte b=10;
	char c='c';
	int i=10;
	short s=2;
	long l=10l;
	float f=0.2f;
	double d=10;
	
	//Char
	char[] ch=new char[2];
	ch[0]=c;
	
	//From byte to short
	short[] sh=new short[2];
	sh[0]=b;
	sh[1]=s;
	
	
	//From Byte,char,short to int
	
	int[] in=new int[3];
	in[0]=b;
	in[1]=c;
	in[2]=s;
	
	//From Byte,char,short, int to long
	long[] la=new long[4];
	la[0]=b;
	la[1]=s;
	la[2]=c;
	la[3]=i;
	
	//From Byte,char,short, int ,long to float
	float[] fl=new float[5];
	fl[0]=b;
	fl[1]=s;
	fl[2]=c;
	fl[3]=i;
	fl[4]=l;
	
	//From Byte,char,short, int ,long, float to double
	double[] db=new double[6];
	db[0]=b;
	db[1]=s;
	db[2]=c;
	db[3]=i;
	db[4]=l;
	db[5]=f;
	
	for(int j=0;j<1;j++)
	{
		System.out.println(ch[j]+" "+sh[j]+""+in[j]+""+la[j]+" "+fl[j]+" "+db[j]);
	}
	
	
	
	
	
	
	
	
	
	
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
