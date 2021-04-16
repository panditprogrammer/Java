//Nested class or Inner class

//outer class will be either public or default
class Main
{
	static int a; 
	
	int x; //we cannot access non static variable in static class
	
	
	//create a non static inner class
	
	//inner class may be public ,private ,protected or default
	class Inner
	{
		public void fun1()
		{
			 x= 20;
			System.out.println("This is inner class ");
			System.out.println("Value of x is "+x);
		}
	}
	
}

public class NestedClass1
{
	public static void main(String []args)
	{
		//create an object of inner class
		Main m = new Main();
		
		//create an object of inner class using outer class object
		Main.Inner object1 = m.new Inner();  
		
		object1.fun1();
	}
	
}




