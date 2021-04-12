//Exception handle in java Explicit throw exception
//throw keyword 
public class ExceptionHandle1
{
	public static void main(String []args)
	{
		int balance = 500;
		int withdrawAmount = 1000;
		
		try
		{
			if(balance <withdrawAmount)
			{
				throw new ArithmeticException("Insufficient Balance"); //our throw 
			}
			balance = balance - withdrawAmount;
			System.out.println("Transaction Success");
			
		}
		catch(ArithmeticException e)   //our catch 
		{
			System.out.println("Error is "+e.getMessage());
		}
		System.out.println("last line");
	}
	
}