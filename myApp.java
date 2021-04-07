//create package
package pack1;

//importing a package
import pack2.student;

/*
To compile the java file "javac -d . filename.java"
To run the program  java packageName.className
*/
public class myApp
{
  public static void main(String []args)
  {
    student s1 = new student();
    s1.setRoll(20);
    s1.setName("Rahul");
    System.out.println("Roll no is "+s1.getRoll());
    System.out.println("Name is "+s1.getName());
  }
}