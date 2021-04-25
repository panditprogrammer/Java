//Collection  arraylist ,linkedlist,vector etc.
import java.util.*;
public class CollectionExample
{
	public static void main(String []args)
	{
		// create an object 
		ArrayList<String> list1 = new ArrayList<String>(5);
		
		//adding value in list 
		list1.add("Rahul");
		list1.add("ruby");
		list1.add("Sonam");
		
		// accessing element using iterator
		Iterator<String> iterate = list1.iterator();
		
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
		}
	}
}