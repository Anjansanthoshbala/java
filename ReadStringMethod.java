import java.util.*;
class ReadStringMethod
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("\nReading a string by using nextline() method _________");
System.out.print("\nEnter the String: ");
String s = sc.nextLine();
System.out.print("\nEnter the string is: "+s);

System.out.print("\nReading a string by using format() method _________");
String str1 = String.format("%s", "Hello welcome to java programs. ");
System.out.print("\nThe string is: "+str1);
}
} 

   
  