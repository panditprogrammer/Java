//static member inheritance

class Parent
{
	static int y = 0; //static member variable cannot be inherite
	public static void fun1()
	{
		System.out.println("Hello world");
	}
}

//fun1 called function hiding in case of static member function
class Child extends Parent
{
	static int y = 10;
	public static void fun1() //function hiding
	{
		System.out.println("Hello from child fun1");
	}
}

public class Example6
{
	public static void main(String []args)
	{
		Child.fun1();
	}
}
	