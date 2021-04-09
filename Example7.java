//constructor in inheritance 
class Test1
{
	int a;
	public Test1(int x) //constructor with argument
	{
		a= x;
		System.out.println("Class Test1 a = "+a);
	}
}

class Test2 extends Test1
{
	int b;
	//this constructor called first Test1 constructor
	public Test2() //constructor
	{
		super(100);  //super keyword is force to called Test1 constructor
		System.out.println("Class Test2 called");
	}
}

public class Example7
{
	public static void main(String []args)
	{
		Test2 t1 = new Test2();
	}
}