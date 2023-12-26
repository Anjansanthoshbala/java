//Program to display first n nutural numbers
import java.util.Scanner;
public class FirstNatural
{
    public static void main(String args[])
    {
        System.out.print("Enter the total number: ");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        System.out.println("First n natural numbers are ");
        for(int i = 1;i <= number; i++)
        {
            System.out.print(i);
        }
    }
}