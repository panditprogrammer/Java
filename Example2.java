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
	public void f1(int a)  //function 1 overridding same signature as parent class function
	{
		System.out.println("From Class B");
	}
}

	
public class Example2
{
	public static void main(String []args)
	{
		B objb1 = new B();
		objb1.f1(4);
		 
		 A obja = new A();
		 obja.f1(4);
		
	}
}
