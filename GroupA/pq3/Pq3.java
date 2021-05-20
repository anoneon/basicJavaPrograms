import java.io.*;
import java.io.DataInputStream;

class Hcf
{
	DataInputStream ob = new DataInputStream(System.in);
	String str;
	void fn() throws IOException
	{
		int a,b;
		System.out.print("Enter 1st number : ");
		str=ob.readLine();
		a=Integer.parseInt(str);
		System.out.print("Enter 2nd number : ");
		str=ob.readLine();
		b=Integer.parseInt(str);
		int c=a;
		int d=b;
		int t;
		while(b>0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		int hcf=a;
		System.out.print("\n the hcf of " + c +" & " + d + " is " + hcf);
	}
}

class Pq3
{
	public static void main(String[] arg) throws IOException
	{
		Hcf obj = new Hcf();
		obj.fn();
	}
}