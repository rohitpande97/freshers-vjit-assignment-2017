public class Server
{
int i=0,j=0;
int data[] = new int[100];
Order_reg order =new Order_reg();
	void serve(int x)
	{
		
		switch(x)
		{
		case 1:
			order(1);
			break;
		case 2:
			order(2);
			break;
		case 3:
			order(3);
			break;
		case 4:
			order(4);
			break;
		case 5:
			order(5);
			break;
		case 6:
			order(6);
			break;
		case 7:
			order(7);
			break;
		case 8:
			order(8);
			break;
		case 9:
			order(9);
			break;
		case 10:
			order(10);
			break;
		case 11:
			order(11);
			break;
		case 12:
			order(12);
			break;
		case 13:
			order(13);
			break;
		case 14:
			order(14);
			break;
		case 15:
			order(15);
			break;
		case 16:
			order(16);
			break;
		case 17:
			order(17);
			break;
		case 18:
			order(18);
			break;
		case 19:
			order(19);
			break;
		case 20:
			order(20);
			break;
		case 21:
			order(21);;
			break;
		case 22:
			order(22);
			break;
		case 23 :
			order(23);
			break;
		case 24:
			order(24);
			break;
		case 25:
			order(25);
			break;
		case 26:
			order(26);
			break;
		case 27:
			order(27);
			break;
		}
		
	}
	
	
	void order(int z)
	{
	 data[i]=z;
	 i++;
		
	}
	void view_order()
	{
		System.out.println("\n\nHere is your order - \n");
		for(j=0;j<i;j++)
		{
			v(data[j]);
		}
	}
	void v(int k)
	{
		System.out.println("\n");
		switch(k)
		{
		case 1:
			System.out.print("Veg Manchuria - Served");
			order.add_order("Veg Manchuria");
			break;
		case 2:
			System.out.print("Masala Papad - Served");
			order.add_order("Masala Papad");
			break;
		case 3:
			System.out.print("Chicken Lollipop - Served");
			order.add_order("Chicken Lollipop");
			break;
		case 4:
			System.out.print("Finger Chips - Served");
			order.add_order("Finger Chips");
			break;
		case 5:
			System.out.print("Veg Soup - Served");
			order.add_order("Veg Soup");
			break;
		case 6:
			System.out.print("Mushroom soup - Served");
			order.add_order("Mushroom soup");
			break;
		case 7:
			System.out.print("Chicken Clear Soup - Served");
			order.add_order("Chicken Clear Soup");
			break;
		case 8:
			System.out.print("Chicken Curry - Served");
			order.add_order("Chicken Curry");
			break;
		case 9:
			System.out.print("Mutton Curry - Served");
			order.add_order("Mutton Curry");
			break;
		case 10:
			System.out.print("Chicken Tikka - Served");
			order.add_order("Chicken Tikka");
			break;
		case 11:
			System.out.print("Methi Chaman - Served");
			order.add_order("Methi Chaman");
			break;
		case 12:
			System.out.print("Kaju Curry - Served");
			order.add_order("Kaju Curry");
			break;
		case 13:
			System.out.print("Keema Curry - Served");
			order.add_order("Keema Curry");
			break;
		case 14:
			System.out.print("Malai Kofta - Served");
			order.add_order("Malai Kofta");
			break;
		case 15:
			System.out.print("Paneer Butter Masala - Served");
			order.add_order("Paneer Butter Masala");
			break;
		case 16:
			System.out.print("Mushroom Masala - Served");
			order.add_order("Mushroom Masala");
			break;
		case 17:
			System.out.print("Kadai Vegetable - Served");
			order.add_order("Kadai Vegetable");
			break;
		case 18:
			System.out.print("Paneer Butter Masala");
			order.add_order("Paneer Butter Masala");
			break;
		case 19:
			System.out.print("Mushroom Fry - For Take Away");
			order.add_order("Mushroom Fry");
			break;
		case 20:
			System.out.print("Mutton Curry - For Take Away");
			order.add_order("Mutton Curry ");
			break;
		case 21:
			System.out.print("Shahi Chicken - For Take Away");
			order.add_order("Shahi Chicken");
			break;
		case 22:
			System.out.print("Malai Kofta - For Take Away");
			order.add_order("Malai Kofta");
			break;
		case 23 :
			System.out.print("Methi Chaman - For Take Away");
			order.add_order("Methi Chaman");
			break;
		case 24:
			System.out.print("Kaju Curry - For Take Away");
			order.add_order("Kaju Curry");
			break;
		case 25:
			System.out.print("Keema Curry - For Take Away");
			order.add_order("Keema Curry");
			break;
		case 26:
			System.out.print("Kadai Vegetable - For Take Away");
			order.add_order("Kadai Vegetable");
			break;
		case 27:
			System.out.print("Chicken Tikka - For Take Away");
			order.add_order("Malai Kofta");
			break;
		}
	}

}
