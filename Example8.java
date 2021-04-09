//constructor can called constructor same class or parent class
class Demo
{
	public Demo()
	{
		System.out.println(" Class Demo constructor called");
	}
}

class Test extends Demo
{
	public Test()
	{
		this(10);  //this keyword is used for calling this class constructor
		
		System.out.println("Class Test");
	}
		
		//compiler implicitely called super class constructor 
	public Test(int y)
	{
		//super();  
		System.out.println("class Test y = "+y);
	}
}

public class Example8
{
	public static void main(String []args)
	{
		Test t1 = new Test();
	}
}