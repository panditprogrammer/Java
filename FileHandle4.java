//file handling in java
//writing in file using Buffered writer class
import java.io.*;

public class FileHandle4
{
	public static void main(String []args) throws IOException
	{
		
		//creating a buffered class for writing content and passing object of FileWriter
		FileWriter filewrite = new FileWriter("D:/GITHUB/Java/file1.txt",true);
		
		BufferedWriter buff = new BufferedWriter(filewrite);
		
		String str1 = "\nI am programmer";
		//writing in file using buffered
		buff.write(str1);
		buff.close();
		
	}
}