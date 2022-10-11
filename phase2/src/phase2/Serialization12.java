package phase2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization12{

	public static void main(String[] args) {
		Student s = new Student("prathiksha",21);
		try
		{
			FileOutputStream fos = new FileOutputStream("D:\\myFile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(s);
			out.close();
			out.close();
			System.out.println("serialized successfully");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
