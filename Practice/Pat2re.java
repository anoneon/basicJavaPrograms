import java.io.*;
import java.io.DataInputStream;

class Ma2re
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
				if(i%2 ==0)
				{
					for(int j=1;j<=(i/2)+1;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				else
				{
					for(int k=1;k<=i/2;k++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
		}
	}
}

class Pat2re
{
	public static void main(String[] a) throws IOException
	{
		Ma2 an = new Ma2();
		an.fn();
	}
}