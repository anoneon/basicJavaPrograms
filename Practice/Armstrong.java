import java.io.*;
import java.io.DataInputStream;


class Cal
{
	String str;

	int power(int a, int b)
	{
		int c,p=1;
		for(c=1;c<=b;c++)
		p=p*a;
	return p;
	}
	
	void fn() throws IOException
	{
		DataInputStream d = new DataInputStream(System.in);

		System.out.print("enter a num : ");
		str = d.readLine();
		int n = Integer.parseInt(str);

		int a,b,s,powe,r;
		powe= 0;
		s = 0;
		a = n;
		b = n;

		while(n>0)
		{
			powe+=1;
			n/=10;
		}

		while(a>0)
		{
			r=a % 10;
			s=s + power(r,powe);
			a/=10;
		}

		if(s==b)
			System.out.print("\n the num " + b + " is armstrong");

		else
			System.out.print("\n the num " + b + " is not armstrong");

	}
}

class Armstrong
{
	public static void main(String[] args) throws IOException
	{
		Cal a = new Cal();
		a.fn();
	}

}