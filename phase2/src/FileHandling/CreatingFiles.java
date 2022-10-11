package FileHandling;

import java.io.File;
import java.io.IOException;
public class CreatingFiles {
 
			public static void main(String[] args)
			{
				File obj = new File("C:\\hello.txt");
				try {
				if(obj.createNewFile())
				{
					System.out.println("file created");
				}
				else
				{
					System.out.println("file already existst");
				}
			}

		catch(IOException e)
		{
		e.printStackTrace();
		}
	}
}
