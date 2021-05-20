import java.io.*;

class facto
{
	DataInputStream o = new DataInputStream(System.in);
	String st;
	int n,fact;
	
	void fn() throws IOException
	{
		fact=1;
		System.out.print("Enter n : ");
		st=o.readLine();
		n=Integer.parseInt(st);
		for(int i=n;i>=1;i--)
		{
			fact*=i;
		}
		System.out.print("\nfactorial = " + fact);		
	}
}

class Pq22
{
	public static void main(String[] args) throws IOException
	{
		facto obj = new facto();
		obj.fn();
	}
}