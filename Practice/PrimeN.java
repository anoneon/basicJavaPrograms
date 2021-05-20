import java.io.*;
import java.io.DataInputStream;

class FinN
{	
	String st;

	void fn() throws IOException
	{
		DataInputStream kee = new DataInputStream(System.in);
		System.out.print("Enter a num : ");
		st=kee.readLine();
		
		int a = Integer.parseInt(st);
		System.out.println("");

		for(int j=1;j<=a;j++)
		{

			int c = 0;

			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0)
				c+=1;
			}
		
			if(c==0)
			{
				System.out.print(j + " ");
			}
		}
		
	}
}

class PrimeN
{
	public static void main(String[] args) throws IOException
	{
		FinN ob = new FinN();
		ob.fn();
	}
}
