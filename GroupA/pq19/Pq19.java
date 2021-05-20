import java.io.*;

class Plin
{
	DataInputStream o = new DataInputStream(System.in);
	String st;
	int n,flag=0;

	void fn() throws IOException
	{
		
		System.out.print("Enter string : ");
		st=o.readLine();
		n=st.length();
		for(int i=0;i<n/2;i++)
		{
			if(st.charAt(i)!=st.charAt(n-i-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("\nthe string is palindrome");
		}
		else
			System.out.print("\nthe string is not palindrome");
		
	}
}

class Pq19
{
	public static void main(String[] args) throws IOException
	{
		Plin obj = new Plin();
		obj.fn();
	}
}