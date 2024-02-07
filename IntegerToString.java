import java.io.*;
import java.util.*;
class IntegerToString
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of elements in the Array: ");
int size = s.nextInt();
int array[] = new int[size];
System.out.println("Enter " + size + " elements ");
for(int i=0; i < size; i++)
{
   array[i] = s.nextInt();
}
System.out.println("Integer arrays to string representation is: " + Arrays.toString(array)); 
}
}




