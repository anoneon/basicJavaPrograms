import java.io.*;

class Sume
{
	String st;
	DataInputStream d = new DataInputStream(System.in);
	void fn() throws IOException
	{
		int sum=0,x;
		System.out.print("enter x : ");
		st=d.readLine();
		x=Integer.parseInt(st);
		for(int i=1;i<=100;i++)
		{
			sum=sum+(x*x);
		}
		System.out.print("Summation is : " + sum );
	}
}

class Summation
{
	public static void main(String args[]) throws IOException
	{
		Sume obj = new Sume();
		obj.fn();
	}
}