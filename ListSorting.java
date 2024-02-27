import java.util.Scanner;

public class ListSorting
{
     public static void main(String args[])
     {
         System.out.print("Code for sorting the input name in ascending order ---");
	 Scanner reader = new Scanner(System.in);
         

        NameList n = new NameList();
  	n.input_names();
    	n.sort_names();
  	n.show_names();
     }
}

class NameList
{
	int num = 5;      
    	String[] names = new String[num];


	void input_names()
	{
        	Scanner reader = new Scanner(System.in);
  	      System.out.print("\nEnter the names -----------");
  	      for (int i = 0; i < num; i++  )
        {
            System.out.print("\nEnter the name "+(i+1) + ":  ");
            names[i] = new String(reader.next());
        }
        }
    
     void sort_names()
    	{  
        
        for (int i = 0; i<num; i++)
        {
            for (int j=i+1; j<num; j++)
            {
                if (names[i].compareTo(names[j]) > 0)
                {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        
    }

     void show_names()
	{
	System.out.print("\nSorted names are ---");
        for (int i=0; i<num; i++)
        {
            System.out.print("\n" + names[i]);
        }
	}
}