//File Handling in Java writing in file
//file outputstream

import java.io.*;

public class FileHandle2
{
	public static void main(String []args) throws IOException
	{
		int i;
		
		//create a fileOutPut stream for writing in file
		FileOutputStream fileOut;
		fileOut = new FileOutputStream("D:/GITHUB/Java/file1.txt",true);
		
		//create a string to writing in file
		String string1 = "Hello World";
		
		//writing in file character by character
		//type casting into char array
		char ch[] = string1.toCharArray();
		
		for(i =0;i<string1.length();i++)
		{
			fileOut.write(ch[i]);
		}
		//closing the file to save changes in hard disk
		fileOut.close();
		
	}
}