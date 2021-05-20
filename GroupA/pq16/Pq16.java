import java.io.*;

class Pq16_h_2h
{

	int n;
	int[] arr={30,40,-10,-100,20,100};
	int h,h2,h3;

	void find()
	{
		h=0;
		h2=0;
		h3=0;

		n=arr.length;
		System.out.print("\nthe array is : ");
		for(int j=0;j<n;j++)
		System.out.print(arr[j]+ " ");
				
		for(int i=0;i<n;i++)
		{
			if(arr[i]>h)
			{	
				h3=h2;
				h2=h;
				h=arr[i];
			}
		}

			
		
		System.out.print("\nthe highest is : " + h + "\nthe second highest is : " + h2 +"\nthe third highest is : " + h3);

		
		
	}

	
}

class Pq16
{
	public static void main(String[] args)
	{
		
		Pq16_h_2h obj = new Pq16_h_2h();
		obj.find();
		
		
	}
}