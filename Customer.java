import java.util.Scanner;



class Customer
{
	Scanner s= new Scanner(System.in);
	public String name;
    void name()
    {
	  System.out.println("\nEnter your name:");
	  name=s.nextLine();
	  name=name.toUpperCase();
	}
    void welcome()
    {
    	System.out.println("Welcome to PARADISE restaurant\t"+name);
    }
}
