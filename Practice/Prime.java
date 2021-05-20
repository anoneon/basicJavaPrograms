import java.io.*;
import java.io.DataInputStream;

class Fin
{	
	String st;

	void fn() throws IOException
	{
		DataInputStream kee = new DataInputStream(System.in);
		System.out.print("Enter a num : ");
		st=kee.readLine();
		
		int a = Integer.parseInt(st);
		int c = 0;

		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			 c+=1;
		}
		
		if(c==0)
		{
			System.out.print("\n the number " + a + " is prime");
		}
		else
		{
			System.out.print("\n the number " + a + " is not prime");
		}
	}
}

class Prime
{
	public static void main(String[] args) throws IOException
	{
		Fin ob = new Fin();
		ob.fn();
	}
}
