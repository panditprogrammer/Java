//Generic class in java
public class GenericClass
{
	public static void main(String []args)
	{
		//creating object of Example class
		Example<String> E1 = new Example<String>();
		Example<Integer> E2 = new Example<Integer>();
		
		E2.set(5);
		E1.set("Ruby");
		
		System.out.println(" E1 = "+E1.get()+" E2 = "+E2.get());
		
	}

}

//this is for generic class
class Example <X>
{
	X  x1; //create a variable
	
	//set function 
	public void set(X a)
	{ x1 = a; }
	
	//get function
	public X get()
	{return x1;}
}
