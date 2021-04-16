//Nested class or Inner class

class Main
{
	//create a static inner class
	static class Inner
	{
		public void fun1()
		{
			System.out.println("This is inner class ");
		}
	}
	
}

public class NestedClass
{
	public static void main(String []args)
	{
		//create an object of static inner class
		Main.Inner object1 = new Main.Inner();  
		
		object1.fun1();
	}
	
}




