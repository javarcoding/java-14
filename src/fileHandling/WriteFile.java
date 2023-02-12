package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("D://My File//TestingFile.xls");
		
		int a=0;
		
		while ((a=file.read())!=-1) 
		{
			System.out.print((char)a);
			
		}

	}

}
