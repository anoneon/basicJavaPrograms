import java.io.*;
class Hinput
{
	int a,b;
	void fn1()
	{
		a=30;
		b=20;
	}
}

class Hadd extends Hinput
{
	int s;
	void fn2()
	{
		s=a+b;
	}
}

class Haddp extends Hadd
{
	void fn22()
	{
		System.out.print("the sum of " + a + " & " + b + " is " + s);
	}
}

class Hsub extends Hinput
{
	int c;
	void fn3()
	{
		c=a-b;
	}
}

class Hsubp extends Hsub
{
	void fn33()
	{
		System.out.print("\nthe difference of " + a + " & " + b + " is " + c); 
	}
}

class HybridI
{
	public static void main(String[] arg)
	{
		Haddp obj1 = new Haddp();
		Hsubp obj2 = new Hsubp();
		obj1.fn1();
		obj1.fn2();
		obj1.fn22();
		obj2.fn1();
		obj2.fn3();
		obj2.fn33();
	}
}

		