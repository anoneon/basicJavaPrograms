import java.io.*;

class SumPq9
{
	DataInputStream o = new DataInputStream(System.in);
	String st;
	int n,sum;
	
	void fn() throws IOException
	{
		sum=0;
		System.out.print("Enter n : ");
		st=o.readLine();
		n=Integer.parseInt(st);
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
		}
		System.out.print("\nsum = " + sum);		
	}
}

class Pq9
{
	public static void main(String[] args) throws IOException
	{
		SumPq9 obj = new SumPq9();
		obj.fn();
	}
}