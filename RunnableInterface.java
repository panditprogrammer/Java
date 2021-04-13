//Thread in java using Runnable interface

class A implements Runnable  //Runnable is an Interface we have implement
{
	public void run()  //overriding the run method of Runnable interface
	{
		int x;
		for(x=0;x<10;x++)
		{
			System.out.println("Thread 1 "+x);
			System.out.println("This is thread 1\n");
		}
	}
}


class B implements Runnable  //Runnable is an Interface we have implement
{
	public void run()  //overriding the run method of Runnable interface
	{
		int x;
		for(x=0;x<10;x++)
		{
			System.out.println("Thread 2 "+x);
			System.out.println("This is thread 2\n");
		}
	}
}

public class RunnableInterface
{
	public static void main(String []args)
	{
		//creating a thread 
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		
		//starting the thread
		t1.start();
		t2.start();
	}
}