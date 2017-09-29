import java.util.Scanner;



class Customer
{
	Scanner s= new Scanner(System.in);
	Scanner s1= new Scanner(System.in);
	Scanner s2= new Scanner(System.in);
	Feedback_forum fe=new Feedback_forum();
	public String name,f;
	int o;
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
    void leave()
    {
    	System.out.println("Customer "+name+" Leaves the PARADISE Restaurant");
    }
    void feedback()
    {
    	System.out.println(name+"\t,Would you like to give us some feed back?\n"
    			+ "1.Yes\n"
    			+ "2.No\n");
    	o=s2.nextInt();
    	if(o==1)
    	{
    		System.out.println("\nPlease enter your feedback here:\n");
    	f=s1.nextLine();
    	fe.add(f);
    	System.out.println("\nThank you for visiting our hotel  "+name+"\nPlease visit us again\n");
    	}
    	else
    	{
    	System.out.println("\nThank you for visiting our hotel  "+name+"\nPlease visit us again\n");
    	}
    }
}
