import java.io.*;

class UseMO
{
	int c,d,s;
	
	void fn(int a, int b)
	{
		c=a;
		d=b;
	}
	
	int fn()
	{
		s=c+d;
		return s;
	}
	
	void fn(int sum)
	{
		System.out.print("the sum = " + sum);
	}
}

public class MO
{
	public static void main(String[] ar)
	{
		UseMO obj = new UseMO();
		obj.fn(10,30);
		int r = obj.fn();
		obj.fn(r);
	}
}