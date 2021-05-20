import java.io.*;
import java.io.DataInputStream;

class Ma1
{
	String st;
	void fn() throws IOException
	{
		DataInputStream d = new DataInputStream(System.in);
		System.out.print("Enter how many lines : ");
		st = d.readLine();
		int n = Integer.parseInt(st);
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
		
		System.out.println();
		}
	}
}

class Pat1
{
	public static void main(String[] a) throws IOException
	{
		Ma1 an = new Ma1();
		an.fn();
	}
}