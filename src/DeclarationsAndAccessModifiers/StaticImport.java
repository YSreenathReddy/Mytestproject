package DeclarationsAndAccessModifiers;

import static java.lang.Math.sqrt;
import static java.lang.Math.sin;
import static java.lang.System.out;
import static java.lang.Integer.MAX_VALUE;

import org.apache.xalan.xsltc.trax.Util;
public class StaticImport {

	public static void main(String[] args) 
	{
		out.println(sqrt(10));
		out.println(sin(10));
		out.println(Math.max(20,30));
		out.println(Util.toJavaName("Sreenath"));
		out.print("s");
		
		out.println(MAX_VALUE);
		

	}

}
