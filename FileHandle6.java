//file handling in java
//reading file content using Buffered reader class
import java.io.*;

public class FileHandle6
{
	//main function with ioException
	public static void main(String []args) throws IOException
	{
		//create a filereader class object
		FileReader fileRead = new FileReader("D:/GITHUB/Java/file1.txt");

		//create a buffered reader class object
		BufferedReader buff = new BufferedReader(fileRead);
		
		//reading from file
		String str ="hello"; //this is temperary
		while(str != null)
		{
			str = buff.readLine();
			if(str != null)
				System.out.println(str);
		}
		buff.close();
	}
}