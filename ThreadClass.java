//Thread class

class MYThread extends Thread
{
	public void run() //overriding function
	{
		//just for testing
		int i;
		for(i=0;i<10;i++)
			System.out.println("Thread one "+i);
		
		
	}
}


class MYThread2 extends Thread
{
	public void run() //overriding function 
	{
		//just for testing
		int i;
		for(i=0;i<10;i++)
			System.out.println("Thread two\n "+i);
		
		
	}
}

 
public class ThreadClass
{
	public static void main(String []args)
	{
		MYThread m1 = new MYThread();
		
		MYThread2 m2 = new MYThread2();
		m2.start();
		m1.start();
	}
}