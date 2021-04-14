//file handling in java 
//FileInputStream 
import java.io.*;

public class FileHandle3
{
	//exception handling with file
	public static void main(String []args) throws IOException
	{
		int i=1;
		//fileInputStream obect
		FileInputStream fileIn = new FileInputStream("D:/GITHUB/java/file1.txt");
		
		while(i != -1) //if i ==-1 means end of file 
		{
			i = fileIn.read();  //read function returning character after reading
			if(i != -1)
				System.out.println((char)i); //printing i after casting into char
		}
		fileIn.close();
		
	}
}