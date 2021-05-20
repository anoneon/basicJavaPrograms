import java.io.*;

class CmpSum
{
	DataInputStream o = new DataInputStream(System.in);
	String st;
	int n,sum;
	
	void fn() throws IOException
	{
		sum=0;
		System.out.print("Enter x : ");
		st=o.readLine();
		n=Integer.parseInt(st);
	
	
		for(int i=1;i<=100;i++)
		{
			sum=sum+(n*n);
		}
		System.out.print("\n computed sum = " + sum);
	}
}

class Pq7
{
	public static void main(String[] args) throws IOException
	{
		CmpSum obj = new CmpSum();
		obj.fn();
	}
}