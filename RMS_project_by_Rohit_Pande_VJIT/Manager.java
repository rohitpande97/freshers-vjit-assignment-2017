import java.util.Scanner;

public class Manager
{
	int op,x=0,pay=0,ret=0,t=0;
	Bill current = new Bill();
	Executive_chef exe=new Executive_chef();
	Scanner s1 = new Scanner(System.in);
	Cash_reg regis=new Cash_reg();
	
	
	void greet()
	{
		System.out.println("\n\nHello,\nI am the Manager\nMay I Know what would you like to eat?");
	}
	
	
	
	void take_order()
	{
		do
	    {
	    	System.out.println("\n\nEnter your choice\n"
	    			+ "1.Starters Menu\n"
	    			+ "2.Main Course Menu\n"
	    			+ "3.Take Away Menu\n"
	    			+ "4.Place Order\n"
	    			+ "5.Recieve Bill");
	    	x=s1.nextInt();
	    	if(x==1)
	    	{
	    	dis_start();	
	    	}
	    	else if(x==2)
	    	{
	    	 dis_main();
	    	}
	    	else if(x==3)
	    	{
	    	 take_away();
	    	}
	    	else if(x==4)
	    	{
	    		exe.r();
	    		t++;
	    	}
	    	
	    }while(x>0 && x<5);
	}
	
	
	void dis_start()
	{
		System.out.println("\n**************Starters Menu****************\n"
				+ "1.Veg Manchuria=Rs.140\n"
				+ "2.Masala Papad=Rs.80\n"
				+ "3.Chicken Lollipop=Rs.140"
				+ "\n4.Finger Chips=Rs.100\n"
				+ "5.Veg Soup=Rs.120"
				+"6.Mushroom soup=Rs.150"
				+ "\n7.Chicken Clear Soup=Rs.180");
		op=s1.nextInt();
		switch(op)
		{
		case 1:
			current.add_bill(140);
			exe.place_order(1);
			break;
		case 2:
			current.add_bill(80);
			exe.place_order(2);
			break;
		case 3:
			current.add_bill(140);
			exe.place_order(3);
			break;
		case 4:
			current.add_bill(100);
			exe.place_order(4);
			break;
		case 5:
			current.add_bill(120);
			exe.place_order(5);
			break;
		case 6:
			current.add_bill(150);
			exe.place_order(6);
			break;
		case 7:
			current.add_bill(180);
			exe.place_order(7);
			break;
		default:
			break;
		}
	}
	
	
	
	void dis_main()
	{
		System.out.println("**************Main Course Menu********************\n"
				+ "1.Chicken Curry=Rs.180"
				+ "\n2.Mutton Curry=Rs.200"
				+ "\n3.Chicken Tikka=Rs.210"
				+ "\n4.Methi Chaman=Rs.150"
				+ "\n5.Kaju Curry=Rs180"
				+ "\n6.Keema Curry=Rs250"
				+ "\n7.Malai Kofta=180"
				+ "\n8.Paneer Butter Masala=Rs.170"
				+ "\n9.Mushroom Masala=Rs.200"
				+ "\n10.Kadai Vegetable=Rs.165");
		op=s1.nextInt();
		switch(op)
		{
		case 1:
			current.add_bill(180);
			exe.place_order(8);
			break;
		case 2:
			current.add_bill(200);
			exe.place_order(9);
			break;
		case 3:
			current.add_bill(210);
			exe.place_order(10);
			break;
		case 4:
			current.add_bill(150);
			exe.place_order(11);
			break;
		case 5:
			current.add_bill(180);
			exe.place_order(12);
			break;
		case 6:
			current.add_bill(250);
			exe.place_order(13);
			break;
		case 7:
			current.add_bill(180);
			exe.place_order(14);
			break;
		case 8:
			current.add_bill(170);
			exe.place_order(15);
			break;
		case 9:
			current.add_bill(200);
			exe.place_order(16);
			break;
		case 10:
			current.add_bill(165);
			exe.place_order(17);
			break;
		default: 
		break;
			
		}
	}
    void take_away()
    {
    	System.out.println("\n***************************Here is the take away menu*******************\n"
    			+ "1.Paneer Butter Masala=Rs.200\n"
    			+ "2.Mushroom Fry=Rs.270\n"
    			+ "3.Mutton Curry=Rs.330\n"
    			+ "4.Shahi Chicken=Rs.350\n"
    			+ "5.Malai Kofta=Rs.250\n"
    			+ "6.Methi Chaman=Rs.200\n"
    			+ "7.Kaju Curry=Rs.300\n"
    			+ "8.Keema Curry=Rs.370\n"
    			+ "9.Kadai Vegetable=Rs.290\n"
    			+ "10.Chicken Tikka=Rs.300");
    	op=s1.nextInt();
    	switch(op)
		{
		case 1:
			current.add_bill(200);
			exe.place_order(18);
			break;
		case 2:
			current.add_bill(270);
			exe.place_order(19);
			break;
		case 3:
			current.add_bill(330);
			exe.place_order(20);
			break;
		case 4:
			current.add_bill(350);
			exe.place_order(21);
			break;
		case 5:
			current.add_bill(250);
			exe.place_order(22);
			break;
		case 6:
			current.add_bill(200);
			exe.place_order(23);
			break;
		case 7:
			current.add_bill(300);
			exe.place_order(24);
			break;
		case 8:
			current.add_bill(370);
			exe.place_order(25);
			break;
		case 9:
			current.add_bill(290);
			exe.place_order(26);
			break;
		case 10:
			current.add_bill(300);
			exe.place_order(27);
			break;
			
		default:
		    break;		
			
		}
    }
    void bill(int y)
    {
    	System.out.println("For the table number->"+y+"\tHere is your Final Bill - "+t*current.total);
    	
    }
    void rec_bill(int m)
    {
    	ret=current.pay_bill(m,t);
    	System.out.println("Returned the balance amount\t->\t"+ret);
    }
    void cash(int f)
    {
    	regis.add(f, t*current.total);
    }
}
