import java.io.*;

class ErrnExp
{
	public static void main(String[] args)
	{
		int a=10,b=5,c=5,x;
		
		try
		{
			x=(a/(b-c));
		}
		
		catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
		}
		
		x=a/(b+c);
		System.out.print("x=" + x);
	}
}