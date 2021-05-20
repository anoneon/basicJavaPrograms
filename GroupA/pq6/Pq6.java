import java.io.*;

class Pnprint
{
	DataInputStream o = new DataInputStream(System.in);
	String st;
	int n;
	
	void take() throws IOException
	{
		System.out.print("Enter range : ");
		st=o.readLine();
		n=Integer.parseInt(st);
		display();
	}
	
	void display() throws IOException
	{
		for(int i=1;i<=n;i++)
		{
			int flag = 0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				flag=1;
			}
			
			if(flag==0)
			System.out.print(i+" ");
		}
	}
}

class Pq6
{
	public static void main(String[] args) throws IOException
	{
		Pnprint obj = new Pnprint();
		obj.take();
	}
}