//file handling in java
//reading file content using Buffered reader class
import java.io.*;

public class FileHandle5
{
	//main function with ioException
	public static void main(String []args) throws IOException
	{
		//create a filereader class object
		FileReader fileRead = new FileReader("D:/GITHUB/Java/file1.txt");

		//create a buffered reader class object
		BufferedReader buff = new BufferedReader(fileRead);
		
		//reading from file
		int ch = 1;
		while(ch != -1)
		{
			ch = buff.read();
			if(ch != -1)
				System.out.print((char)ch);
		}
		buff.close();
	}
}