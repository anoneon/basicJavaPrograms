import java.io.*;
import java.io.DataInputStream;

class Add
{

	
	void add() throws IOException
	{

		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("enter a num : ");
		str=dis.readLine();
		int a = Integer.parseInt(str);
	

		System.out.print("enter 2nd num : ");
		str=dis.readLine();
		int b = Integer.parseInt(str);

		int c = a + b;
	
		System.out.print("\n the sum is " + c);
	}


	
}

class Sum 
{


	public static void main(String[] args) 
	{

		Add a = new Add();
		a.add();

	}
}
	