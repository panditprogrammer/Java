//abstract class and abstract method
abstract class Person
{
	abstract void show();  //abstract method 
}

class Student extends Person
{
    void show() //abstract method define here
    {
        System.out.println("This is student class after override ");
    }
	
}

public class Example9
{
	public static void main(String []args)
	{
		Student s= new Student();
                s.show();
	}
}