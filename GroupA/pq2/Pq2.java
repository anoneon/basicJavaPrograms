import java.io.*;

class Pprint
{
	void fn()
	{
		for(int i=100;i<=1000;i++)
		{
			int flag = 0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				flag=1;
			}
			
			if(flag==0)
			System.out.print(i+" ");
		}
	}
}

class Pq2
{
	public static void main(String[] args)
	{
		Pprint obj = new Pprint();
		obj.fn();
	}
}