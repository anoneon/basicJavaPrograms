import java.io.*;
import java.io.DataInputStream;


class TryA
{
	String str;

	
	
	void fn() throws IOException
	{
		DataInputStream d = new DataInputStream(System.in);

		System.out.print("enter a num : ");
		str = d.readLine();
		int n = Integer.parseInt(str);

		int a,b,s,powe,r,l;
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
			l=(int)Math.pow(r,powe);
			s=s + l;
			a/=10;
		}

		if(s==b)
			System.out.print("\n the num " + b + " is armstrong");

		else
			System.out.print("\n the num " + b + " is not armstrong");

	}
}

class ArmstrongT
{
	public static void main(String[] args) throws IOException
	{
		TryA a = new TryA();
		a.fn();
	}

}