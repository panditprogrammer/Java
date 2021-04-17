//generic function 

public class GenericMethod
{
	//non premitive type accepted only
	public <datatype> void printArray(datatype []str)
	{
		
		for(int i =0;i<str.length;i++)
			System.out.println(str[i]);
		
	/*
		//this is called for each loop in java
			for(datatype X:str)
				System.out.println(X);
		
		
		*/
	}
	
	
	public static void main(String []args)
	{
		GenericMethod m = new GenericMethod();
		
		//string type array
		String name [] = new String[]{"Rahul","sonam","ruby"};
		m.printArray(name);
		
		//int type array
		Integer N[] = {8,20,28,73,10};
		m.printArray(N);
		
		
	}
}