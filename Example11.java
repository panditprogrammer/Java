import java.util.*;
//Scanner class for taking input from user
public class Example11
{
	public static void main(String []args)
	{
		System.out.println("Enter your Name and age ");
		//taking input from user
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		
		System.out.println("Your name is "+name+" and age is "+age);
	}
}
		
		