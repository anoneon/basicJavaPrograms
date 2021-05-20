import java.io.*;
import java.io.DataInputStream;

class Lcm
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
		int lcm=(c*d)/hcf;
		System.out.print("\n the lcm of " + c +" & " + d + " is " + lcm);
	}
}

class Pq4
{
	public static void main(String[] arg) throws IOException
	{
		Lcm obj = new Lcm();
		obj.fn();
	}
}