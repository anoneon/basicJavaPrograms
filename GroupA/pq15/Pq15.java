import java.io.*;

class SortPq15
{

	int n;
	int[] arr={-10,20,30,-5,10,50,30};
	int temp;
	void sorted() throws IOException
	{
		n=arr.length;
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

class Pq15
{
	public static void main(String[] args) throws IOException
	{
		
		SortPq15 obj = new SortPq15();
		obj.sorted();
		
		
	}
}