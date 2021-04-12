//String class in java
public class StringClass
{
	public static void main(String []args)
	{
		String s1 = new String("hello World");
		String s2,s3;
		
		System.out.println(s1);
		s2 = s1.toUpperCase();  //converting to uppercase
		System.out.println(s2); 
		s3 = s1.toLowerCase(); //converting to lowercase
		System.out.println(s3);
		System.out.println(s1); //s1 is not changed
		
		//indexOf method
		
		int i = s1.indexOf("o");
		System.out.println("\no found at indexOf " +i);
		//checking string index 
		System.out.println("\nString found at "+s1.indexOf("Wo"));
		
		//checking at given index
		System.out.println("\nlastIndexOf " +s1.lastIndexOf("l"));
		
		//camparing two string
		String str1 = "Hello World";
		String str2 = "Hello programmer";
		
		if(str1.equals(str2))
			System.out.println("Strings are same\n ");
		else
			System.out.println("Strings are not same\n");
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Strings are same\n");
		else
			System.out.println("String are not same\n");
		
		//compareTo method
		
		int y = str1.compareTo(str2);
		if(y==0)
			System.out.println("Strings are same\n");
		else if(y<0)
			System.out.println("Dictionary order ");
		else
			System.out.println("opposite of dictionary order");
		
			
		//substring  find at index slicing
		String a = str1.substring(4);
		System.out.println("\nsubstring found  "+a);
		
		a = str1.substring(4,7);
		System.out.println("\nsubstring found  "+a);
			
	}
}