//this keyword and uses 
class Box
{
	private int l,b,h; //instance member variable
	public void setDimension(int l,int b,int h) //local variables
	{
		this.l = l;   //this indicates instance member variable 
		this.b = b; 
		this.h= h;
	}
	
	public void showDimension()
	{
		System.out.println("Length ="+l+" Width = "+b+" hieght = "+h);
	}
	
}

public class example4
{
	public static void main(String []args)
	{
		Box b1 = new Box();
		b1.setDimension(10,6,4);
		b1.showDimension();
	}
	
}