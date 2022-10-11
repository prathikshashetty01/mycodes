package phase2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization12 {

	public static void main(String[] args) {
		//Student obj=null;
		try
		{
			FileInputStream fis= new FileInputStream("D:\\myFile.txt");
			ObjectInputStream input = new ObjectInputStream(fis);
			Student obj =(Student)input.readObject();
			input.close();
			fis.close();
			System.out.println(obj.studentName);
			System.out.println(obj.age);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
