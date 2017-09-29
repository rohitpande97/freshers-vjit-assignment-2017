import java.util.Scanner;
public class MainActivity
{

	private static Scanner s2;

	public static void main(String args[])
	{
		int pay=0;
		s2 = new Scanner(System.in);
		Customer cu= new Customer();
		Host ho= new Host();
		Bus_boy babu=new Bus_boy();
		Manager mehta= new Manager();
		int t=0;
		cu.name();
		cu.welcome();
		ho.number();
		t=ho.assign();
		babu.greet();
	    babu.serve();
	    mehta.greet();
	    mehta.take_order();
	    mehta.bill(t);
	    System.out.println("You can pay now:\n");
	    pay=s2.nextInt();
	    mehta.rec_bill(pay);
	    cu.feedback();
	    cu.leave();
	    babu.clean(t);
	    mehta.cash(t);
	}

}
