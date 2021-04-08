//final keyword 

//created final class we cannot modify this class
final class Test
{
	public void f1()
	{System.out.println("hello from Test class ");}
	
}

//create a final function we cannot modify this function  or override
class d
{
	public final void f1()
	{
		System.out.println("Hello world");
	}
	
}



public class Example3
{
	private final int x; //final instance member variable
	private final static int y; // final static member variable
	
	//static initialization block
	static
	{
		y = 5;
	}
	
	//constructor 
	Example3()
	{
		x = 10;
	}
	public void fun()
	{
		final int a; //final local variable
		System.out.println("fun from Example3 class ");
	}
	
	
	public static void main(String []args)
	{
		Example3 e1 = new Example3();
		e1.fun();
		
		Test t1 = new Test();
		t1.f1();
		
	}
}
	

