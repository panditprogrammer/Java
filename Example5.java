//super keyword and uses 
class Box
{
	private int l,b,h; //instance member variable
	public void setDimension(int l,int b,int h) //local variables
	{
		this.l = l;    
		this.b = b; 
		this.h= h;
	}
	
	public void showDimension()
	{
		System.out.println("Length ="+l+" Width = "+b+" hieght = "+h);
	}
	
}

//subclass 
class subbox extends Box     //inherited class 
{
	public void showDimension()
	{
		System.out.println("subclass showDimension");
		super.showDimension();  //super denotes Box class function
	}
	
}

public class Example5
{
	public static void main(String []args)
	{
		Box b1 = new Box();
		b1.setDimension(10,6,4);
		b1.showDimension();
		
		//create object of class box
		subbox box1 = new subbox();
		box1.setDimension(20,15,8);
		box1.showDimension();
	}
	
}