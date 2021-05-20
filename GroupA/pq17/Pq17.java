import java.io.*;

class MatAS
{

	int[][] a = {{9,10,11},{12,13,14}};
	int[][] b = {{2,8,13},{10,12,14}};
	int[][] sum = new int[2][3];
	int[][] sub = new int[2][3];
	void adsub()
	{
		
		
		System.out.print("\nThe A matrix is : \n\n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("\nThe B matrix is : \n\n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("\nThe Sum matrix is : \n\n");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{	
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("\nThe sub matrix is : \n\n");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{	
				sub[i][j]=a[i][j]-b[i][j];
				System.out.print(sub[i][j] + "\t");
			}
			System.out.println();
		}
	}

	
}

class Pq17
{
	public static void main(String[] args)
	{
		
		MatAS obj = new MatAS();
		obj.adsub();
		
		
	}
}