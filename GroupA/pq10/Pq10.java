import java.io.*;

class sort
{
	DataInputStream o = new DataInputStream(System.in);
	String st;
	int n;
	int[] arr;
	int temp;
	void sorted() throws IOException
	{
		
		
		
	
				
		System.out.print("Enter how many nums : ");
		st=o.readLine();
		n=Integer.parseInt(st);

		int[] arr = new int[n];

		for(int i=0;i<n;i++)
		{	
			st=o.readLine();
			arr[i]=Integer.parseInt(st);
		}
		
		System.out.print("\nthe array is : ");
		for(int j=0;j<n;j++)
		System.out.print(arr[j]+ " ");		
		
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.print("\nthe sorted array is : ");
		for(int j=0;j<n;j++)
		System.out.print(arr[j]+ " ");
		
	}

	
}

class Pq10
{
	public static void main(String[] args) throws IOException
	{
		
		sort obj = new sort();
		obj.sorted();
		
		
	}
}