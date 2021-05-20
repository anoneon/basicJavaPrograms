import java.io.*;

class Tax
{
	DataInputStream o = new DataInputStream(System.in);
	String st;
	double income,taxx,per;
	
	void fn() throws IOException
	{
		
		System.out.print("Enter income(Rs) : ");
		st=o.readLine();
		income=Integer.parseInt(st);
		
	
		if(income>=0 && income<=10000)
			{ 	
				taxx=0;	
				per=0;
			}
		else if(income>10000 && income<=20000)
			{
				taxx=((5/100)*income);	
				per=5;
			}
		else if(income>20000 && income<=30000)
			{	taxx=(10/100)*income;	
				per=10;
			}
		else if(income>30000 && income<=50000)
			{	taxx=(15/100)*income;	
				per=15;
			}
		else if(income>50000)
			{	taxx=(30/100)*income;	
				per=30;
			}
		else
			System.out.print("not allowed");
		
		System.out.print("\nTax to be paid "+per+"% amt Rs. " + taxx);
	}
}

class Pq8
{
	public static void main(String[] args) throws IOException
	{
		Tax obj = new Tax();
		obj.fn();
	}
}