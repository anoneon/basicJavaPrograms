import java.io.*;
import java.io.DataInputStream;


class CalN
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
		System.out.println("");
		
		int a,b,s,powe,r,t;

		for(int i=1;i<=n;i++)
		{

			powe= 0;
			t=i;
			s = 0;
			a=i;
			b=i;

			while(t>0)
			{
				powe=powe+1;
				t/=10;
			}

			while(a>0)
			{
				r=a % 10;
				s=s + power(r,powe);
				a/=10;
			}

			if(s==b)
			System.out.print(b + " ");

		}
	}
}

class ArmstrongN
{
public static void main(String[] args) throws IOException
{
CalN a = new CalN();
a.fn();
}

}