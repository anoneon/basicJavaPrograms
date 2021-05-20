import java.io.*;

class rnum
{
	int a,r,newn,temp;
	String str;
	
	DataInputStream d = new DataInputStream(System.in);

	void fn() throws IOException
	{	
		newn=0;
		System.out.print("enter a number : ");
		str = d.readLine();
		a = Integer.parseInt(str);
		temp = a;
		while(a>0)
		{
			r=a % 10;
			newn=newn*10+r;
			a/=10;
		}
		
		System.out.print("\nThe reverse of " + temp + " is " + newn);
	}
}

class Pq5
{
	public static void main(String arg[]) throws IOException
	{
		rnum obj = new rnum();
		obj.fn();
	}
}