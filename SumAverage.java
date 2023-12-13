//Program to input 5 numbers from keyboard and find the sum and average

import java.util.Scanner;

public class Main 
{
        public static void main(String args[])
        {
          Scanner reader = new Scanner(System.in);
          System.out.println("Enter the first number: ");
          int n1 = reader.nextInt();
          System.out.println("Enter the second number: ");
          int n2 = reader.nextInt();
          System.out.println("Enter the third number: ");
       int n3 = reader.nextInt();
          System.out.println("Enter the fourth number: ");
       int n4 = reader.nextInt();
       System.out.println("Enter the fifth number: ");
       int n5 = reader.nextInt();
       int sum = n1+n2+n3+n4+n5;
       float average = (n1+n2+n3+n4+n5)/5;
       System.out.println("Sum of " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + " = " + sum);
       System.out.println("Average of " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + " = " + sum);
     }
}