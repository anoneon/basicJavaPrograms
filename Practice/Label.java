import java.io.*;
class Lbl
{
	void fn()
	{
		
	loop1:  for(int i=1; ;i++)
		{
			if(i>4)
			 break loop1;

		loop2:	for(int j=1; ;j++)
			{
				System.out.print("+");
				if(j==i)
				{
					System.out.println();
					continue loop1;
				}
			}
			
		}
	}
}

class Label
{
	public static void main(String[] a)
	{
		Lbl an = new Lbl();
		an.fn();
	}
}