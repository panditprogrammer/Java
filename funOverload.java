//function overloading 

class A
{
	public void f1(int x)  //function 1 
	{
		System.out.println("From Class A");
	}
	
	
}

//class B 
class B extends A 
{
	public void f1(int a,int b)  //function 1 overloading
	{
		System.out.println("From Class B");
	}
}

	
public class funOverload
{
	public static void main(String []args)
	{
		B objb1 = new B();
		objb1.f1(4);
		objb1.f1(10,20);
		
	}
}
