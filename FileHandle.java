//File handling in java
import java.io.*;

public class FileHandle
{
	//handling exception this is must for file handling
	public static void main(String []args)  throws IOException
	{
		//creating file object 
		File file = new File("D:/GITHUB/Java/file1.txt");
		
		//checking operation on file object
		System.out.println("File is available ? "+file.exists());
		//createNewFile 
		file.createNewFile();
		System.out.println("File is available ? "+file.exists());
		System.out.println("File size is "+file.length());
		System.out.println("File is writeable  ? "+file.canWrite());
		System.out.println("File name is "+file.getName());
		//deleting file
		file.delete();
		System.out.println("File is available ? "+file.exists());
	}
}