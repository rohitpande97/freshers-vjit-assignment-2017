import java.util.Scanner;
import java.lang.*;
public class MainActivity {
	public static void main(String args[])
	{
		int op1,flag=0;
		Scanner s1= new Scanner(System.in);
		System.out.println("Welcome to PARADISE restaurant"+"\nHow may we help you?");
		do
		{	
		System.out.println("1.Food Menu\n2.Take Away Menu");
	    op1=s1.nextInt();
		}while(op1<1 || op1>2);
	    Printoptions print1= new Printoptions();
	    print1.opt1(op1);
	}
}



class Printoptions{
	Scanner s= new Scanner(System.in);
	int opt1(int i)
	{
		int ch;
	
		if(i==1)
		{
			System.out.println("1.Chicken Biryani = Rs.261\n"
					+ "2.Mutton Biryani = Rs.279\n"
					+ "3.Special Biryani = Rs.920\n"
					+ "4.Special Supreme Chicken Biryani= Rs.980\n"
					+ "5.Special Supreme Mutton Biryani= Rs.1023\n"
					+ "6.Egg Biryani = Rs.214\n"
					+ "7.Veg Biryani = Rs.214\n");
			ch=s.nextInt();
			if(ch<8 && ch>0)
			return ch;
			else
				return 0;
			
			}
		else if(i==2)
		{
			System.out.println("1.Veg Biryani = Rs.150\n"
					+ "2.Chicken Biryani= Rs.166\n"
					+ "3.Mutton Biryani= Rs.174\n"
					+ "4.Chicken Family Pack= Rs.444"
					+ "5.Mutton Family Pack= Rs. 476"
					+ "6.Qubani Ka Meetha= Rs. 75"
					+ "7.Paneer Tikka = Rs. 187");
			ch=s.nextInt();
			if(ch<8 && ch>0)
			return ch;
			else
		    return 0;
		}
		else
			return 0;
	
	}
	
}

class Customer
{
	
	
}
