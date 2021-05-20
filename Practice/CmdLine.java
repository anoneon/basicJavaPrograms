import java.io.*;

class CmdLine
{
	public static void main(String[] args)
	{
		int c = args.length;
		int sum = 0;

		for(int i=0;i<c;i++)
		{
			sum = sum + Integer.parseInt(args[i]);
		}
		
		System.out.print("The sum = " + sum);
	}
}