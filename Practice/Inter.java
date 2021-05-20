import java.io.*;

interface A
{
	int a=1;
}

interface B
{
	int b=2;
}

interface C extends A,B
{
	public int add();
}

class D implements C
{
	int c;

	public int add()
	{
		c=a+b;
		return c;	
	}
}

class Inter
{
	public static void main(String ar[])
	{
		D obj= new D();
		System.out.print(obj.add());
	}
}