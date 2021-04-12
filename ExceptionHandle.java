//Exception handling in java
import java.util.*;
public class ExceptionHandle
{
	public static void main(String []args)
	{
		String s1 = null;
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Enter two numbers ");
		try
		{
			x = sc.nextInt();  //user should Enter only integer numbers
			y = sc.nextInt();
			System.out.println("Sum is "+(x+y)); 
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter integer only "+e.getMessage());
		}
		finally
		{
			//some code goes here
		}
		System.out.println("Thanks for using \n");
	}

}