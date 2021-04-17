//inner anonymous class

class Student
{
	public void show()
	{
		System.out.println("Hello Student ");
	}
}

class Collage
{
	Student s = new Student() //this is called anonymous class
	{
		//overridding 
		public void show()
		{
			System.out.println("You are from Information Technology");
			
		}
		
	};
}

public class AnonymousClass
{
	public static void main(String []args)
	{
		Collage c = new Collage();
		
		c.s.show();  //called anonymous class function
		
	}
}


	