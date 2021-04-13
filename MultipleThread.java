//multithreading in java
//synchronizing multiple thread
import java.util.Scanner;

class Account 
{
	private int balance;
	
	
	public Account(int balance )
	{
		this.balance = balance;
	}
	
	//checking balance 
	public  boolean checkBalance(int w)
	{
		if(balance>w)
			return true;
		else
			return false;	
	}
	
	//withdrawl money 
	public void withdrawl(int a)
	{
		balance = balance -a;
		System.out.println("Successfully withdrawl "+a);
		System.out.println("Current balance is "+balance);
		
	}
	
}

class Customer implements Runnable
{
	private Account account;
	private String name;
	
	//constructor
	public Customer(Account account,String name)
	{
		this.account = account;
		this.name = name;
	}
	
	//overridding run function of Runnable interface
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		
		//synchronizing thread 
		//this block will be access to one thread at a time
		synchronized(account)
		{
			//taking input 
		System.out.println("Enter Amount to Withdrawl for "+name);
		int ammount = sc.nextInt();
		
		
		//checkBalance and withdrawl
		if(account.checkBalance(ammount))
		{
			account.withdrawl(ammount);
			System.out.println("Amount for "+name);
			}
		else
		{
			System.out.println("Insufficient Balance for"+name);
		}
			
		}
		
	}
	
}

//main class 
public class MultipleThread
{
	public static void main(String []args)
	{
		//opening account
		Account A = new Account(1000);
		
		//account assigning to customer
		Customer c1 = new Customer(A,"Ruby");
		Customer c2 = new Customer(A,"python");
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
	}
}




