public class MainActivity
{

	public static void main(String args[])
	{
		Customer cu= new Customer();
		Host ho= new Host();
		Bus_boy babu=new Bus_boy();
		Manager mehta= new Manager();
		int t=0;
		cu.name();
		cu.welcome();
		ho.number();
		t=ho.assign();//Variable 't' here has no use...I have stored the value just test the program
		babu.greet();
	    babu.serve();
	    mehta.greet();
	    mehta.take_order();
	    mehta.bill(t);
	   
	}

}
