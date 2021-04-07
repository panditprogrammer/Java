class StaticClass1
{
  int x; //instance member variable
  private static int y;  //static member variable private not accessible outside of the class
  
  public void func1() {System.out.println("func1 ");}  //instance member function
  
  public static void func2() {System.out.println("static func2");} //for this func accessiable only static variable
  
  //static class 
  static class Test
  {
   public static String me = "Programmer";
  
  }
  
}
public class StaticClass
{
  public static void main(String[] args)
  {
	//create object
  StaticClass1 st1 = new StaticClass1();
  StaticClass1 st2 = new StaticClass1();
  //accessing without an object
  //StaticClass1.y = 5; //not accessible 
  
  StaticClass1.func2();
  System.out.println(StaticClass1.Test.me);

  }
}