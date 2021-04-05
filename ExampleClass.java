//class and object 

//create a class
class Box
{
    private int length,breadth,height;
    
    public void setDimension(int l,int b,int h)
	{
	    length = l;
	    breadth = b;
	    height = h;
	}
   public void showDimension()
    {
	System.out.println("Length is "+length);
	System.out.println("Breadth is "+breadth);
	System.out.println("Height is "+height);
    }
}

//MAIN FUNCTION 
class ExampleClass
{
    public static void main(String [] args)
	{
	    Box b1 = new Box();  //an object is created 
	    b1.setDimension(10,6,4);
	    b1.showDimension();
	}
}