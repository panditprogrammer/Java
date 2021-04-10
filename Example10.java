//interface and its implementations
//interface variables is always public static and final
//we cannot create object of interface only we can create reference variables

//create a  interface
interface demo1
{
	//in interface you can only declare method or variables
	int x =10; 
	void function1();
}

//create a  interface
interface demo2 extends demo1
{
	int a = 20; 
	void function2();
}

//creating a class for implemente interface
//after implementing the interface you must have to define all the methods 
class Test implements demo2
{
	public void function2()
	{
		System.out.println("This is interface function2 after define");
	}
	
	public void function1()
	{
		System.out.println("This is after implementing of interface");
	}
}

//main class
public class Example10
{
	
	public static void main(String []args)
	{
		
		Test t1 = new Test();
		t1.function1();
		t1.function2();
	}	
}