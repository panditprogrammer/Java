//constructor and constructor overlaoding 
public class Box
{
   private int l,b,h;
   
  //create a constructor
   public Box()  //name same as class
   {
	l = 0; b = 0; h= 0;
    }
 //create another constructor this is called constructor overloading
    public Box(int L,int B,int H)  //name same as class name
   {
	l = L; b = B; h= H;
    }
	
	//show data
     public void show()
     {System.out.println("length = "+l+" Height = "+h+" width = "+b+"\n");}
	//create main function
	public static void main(String []args)
	{
	  Box B1 = new Box();
	  Box B2 = new Box(10,8,6);  //constructor arguments
	   B1.show();
	   B2.show();
	}

}