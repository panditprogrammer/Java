//creating 2D array in java
public class ArrayExample13
{
	public static void main(String []args)
	{
		//creating 2d array
		int [][]arr = new int[3][];
		
		//creating nesting array
		arr[0] = new int[2];
		arr[1] = new int[5];
		arr[2] = new int[4];
		
		//checking length of array
		System.out.println("arr[0] Length is "+arr[0].length);
		System.out.println("arr[1] Length is "+arr[1].length);
		System.out.println("arr[2] Length is "+arr[2].length);
	}
}