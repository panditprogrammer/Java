//create a package
package pack2;

/*
To compile the java file "javac -d . filename.java"
To run the program  java packageName.className
*/

public class student
{
  private int rollno;
  private String name;
  public void setRoll(int r)
  {rollno = r;}

  public void setName(String n)
  {name = n;}
  
   public int getRoll()
   {return(rollno);}
   public String getName()
   {return(name);}
}