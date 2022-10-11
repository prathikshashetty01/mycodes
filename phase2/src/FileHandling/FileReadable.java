package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadable {
public static void main(String[] args) {

try {
FileOutputStream out = new FileOutputStream("C:\\\\hello.txt",true);
out.write(97);
out.write(98);
out.close();
System.out.println("filewriiten");
}catch(FileNotFoundException e)
{
e.printStackTrace();
}catch(IOException e)
{
e.printStackTrace();
}
}
}