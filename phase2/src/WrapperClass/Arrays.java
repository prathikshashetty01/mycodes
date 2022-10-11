package WrapperClass;

import java.util.Scanner;

public class Arrays {

public static void main(String[] args) {
int[] a;
Scanner os= new Scanner(System.in);
System.out.println("enter the number");
int size=os.nextInt();
a=new int [size];
System.out.println("enter the elements");
for(int i=0;i<=a.length-1;i++)
{
a[i]=os.nextInt();

}
for(int i=0;i<=a.length-1;i++)
{
System.out.println(a[i]);
}
System.out.println("reverse array");
for(int i=a.length-1;i>=0;i--)
{
System.out.println(a[i]);
}

}

}
