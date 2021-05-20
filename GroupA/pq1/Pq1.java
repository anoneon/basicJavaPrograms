import java.io.*;
import java.lang.*;

class Root
{
	double a,b,c;
	Root()
	{
		a=5;
		b=3;
		c=2;
	}
	void fn()
	{

	double d=b*b-4*a*c;
	
	double x1 = (-b+Math.sqrt(d))/(2*a);
	double x2 = (-b-Math.sqrt(d))/(2*a);
	
	if(d>0)
	{
		System.out.println(d);
		System.out.println(a);System.out.println(b);System.out.println(c);
		System.out.print("Distinct roots");
		System.out.print("\n\tx1 : "+ x1 + "  x2 : " + x2);
	}
	else if(d==0)
	{
		System.out.println(d);
		System.out.println(a);System.out.println(b);System.out.println(c);
		System.out.print("equal roots");
		System.out.print("\n\tx1 : "+ x1 + "  x2 : " + x2);
	}
	else
	{
		System.out.println(d);
		System.out.println(a);System.out.println(b);System.out.println(c);
		System.out.print("imaginary roots");
	}
	}		

}
class Pq1
{
	public static void main(String[] arg)
	{
		Root obj = new Root();
		obj.fn();
	
	}
}