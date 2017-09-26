import java.util.Scanner;
import java.lang.*;
public class MainActivity {
	public static void main(String args[])
	{
		int op1,flag1=0;
		String cu_name;
		Scanner s1= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		Customer cu=new Customer();
		System.out.println("Enter your name:");
		cu_name=s2.nextLine();
		System.out.println("Welcome to PARADISE restaurant"+cu_name+"\nHow may we help you?");
		do
		{	
		System.out.println("\n1.Food Menu\n2.Take Away Menu");
	    op1=s1.nextInt();
		}while(op1<1 || op1>2);
	    Printoptions print1= new Printoptions();
	    flag1=print1.opt1(op1);
	    cu.addbill(flag1);
	
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
				opt1(i);
				return 0;
			
			}
		else if(i==2)
		{
			System.out.println("1.Veg Biryani = Rs.150\n"
					+ "2.Chicken Biryani= Rs.166\n"
					+ "3.Mutton Biryani= Rs.174\n"
					+ "4.Chicken Family Pack= Rs.444\n"
					+ "5.Mutton Family Pack= Rs. 476\n"
					+ "6.Qubani Ka Meetha= Rs. 75\n"
					+ "7.Paneer Tikka = Rs. 187\n");
			ch=s.nextInt();
			if(ch<8 && ch>0)
			return ch+7;
			else
		    return 0;
		}
		else
			return 0;
	
	}
	
}

class Customer
{
  int total=0;	
	void addbill(int i)
	{
		switch(i)
		{
		case 1:
			total+=261;
			break;
		case 2:
			total+=279;
			break;
		case 3:
			total+=920;
			break;
		case 4:
			total+=980;
			break;
		case 5:
			total+=1023;
			break;
		case 6:
			total+=214;
			break;
		case 7:
			total+=214;
			break;
		case 8:
			total+=150;
			break;
		case 9:
			total+=166;
			break;
		case 10:
			total+=174;
			break;
		case 11:
			total+=444;
			break;
		case 12:
			total+=476;
			break;
		case 13:
			total+=75;
			break;
		case 14:
			total+=187;
			break;
		}
	}
		void printbill()
		{
			System.out.println(total);
		}
	
	
}
