package Arrays;

public class ThreeDimentionalArray 
{
	public static void main(String[] args) 
	{
	
		//Three dimensional Array
		
		int[][][] x=new int[3][][];
		x[0]=new int[2][];
		x[0][0]=new int[2];
		x[0][1]=new int[2];
		
		x[1]=new int[2][];
		x[1][0]=new int[2];
		x[1][1]=new int[2];
		System.out.println(x.length);
		
		
		//Single line declaration
		int[][][] y={{{0,1,2},{3,4,5}},{{6,7,8},{9,10,11}}};
		System.out.println(y.length);
		

	}

}
