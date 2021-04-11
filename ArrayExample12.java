import java.util.*;
//array in java 
public class ArrayExample12
{
	public static void main(String []args)
	{
		//create an array 
		int []arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter five numbers ");
		for(i=0;i<5;i++) //arrray length
		{
			arr[i] = sc.nextInt();
		}
		
		for(i = 0;i<5;i++)
			System.out.print(" "+arr[i]);
	}
	
}