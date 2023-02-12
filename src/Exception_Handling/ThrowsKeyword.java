package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThrowsKeyword {
	
	public void display() throws IOException
	{
		FileOutputStream FileOutputStream= new FileOutputStream("C://MyFile//myFile.txt");
		FileOutputStream.write(1234);
		System.out.println("Your file create successfully");
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		ThrowsKeyword t=new ThrowsKeyword();
		//t.display();
		

	}

}
