import java.io.*;
import java.io.DataInputStream;

class Ma2
{
	String st;
	void fn() throws IOException
	{
		DataInputStream d = new DataInputStream(System.in);
		System.out.print("Enter how many lines : ");
		st = d.readLine();
		int n = Integer.parseInt(st);
		for(int i=1;i<=2*n;i++)
		{
			
				for(int k=1;k<=((i%2 == 0)?(i/2):((i/2)+1));k++)
				{
					System.out.print("*");
				}
				System.out.println();
			
		}
	}
}

class Pat2
{
	public static void main(String[] a) throws IOException
	{
		Ma2 an = new Ma2();
		an.fn();
	}
}