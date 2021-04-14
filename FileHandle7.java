//file handling in java
//reading file content using Buffered reader class
import java.io.*;

public class FileHandle7
{
	//main function with ioException
	public static void main(String []args) throws IOException
	{
		//create a filereader class object
		FileReader fileRead = new FileReader("D:/GITHUB/Java/file1.txt");

		//create a buffered reader class object
		BufferedReader buff = new BufferedReader(fileRead);
		
		//reading from file
		char []ch = new char[60];
		
		buff.read(ch,4,10);  //2 is white space at the begining of array and 10 is size  of reading charactoer
		System.out.println(ch);
		
		buff.close();
	}
}