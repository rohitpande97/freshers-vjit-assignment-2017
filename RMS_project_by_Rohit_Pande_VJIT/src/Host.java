import java.util.Scanner;
class Host 
{
	int num,t=0;
	Scanner s1 = new Scanner(System.in);
	void number()
	{
	System.out.println("\n\nGreetings\nMy name is JIGNESH PATEL\n I am the host in this restaurant\n Feel free\n"+"Can you please tell me how many people are along with you(including you)?");
	num=s1.nextInt();
	}
	int assign()
	{
		switch(num)
		{
		case 1:
			System.out.println("Here is your table"+"\nIt is table number 1");
			t=1;
			break;
		case 2:
            System.out.println("Here is your table"+"\nIt is table number 2");
            t=2;
			break;
		case 3:
			System.out.println("Here is your table"+"\nIt is table number 3");
			t=3;
			break;
		case 4:
			System.out.println("Here is your table"+"\nIt is table number 4");
			t=4;
			break;
		case 5:
			System.out.println("Here is your table"+"\nIt is table number 5");
			t=5;
			break;
		case 6:
			System.out.println("Here is your table"+"\nIt is table number 6");
			t=6;
			break;
		case 7:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
			t=7;
			break;
		case 8:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
		    t=8;
		    break;
		case 9:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
		    t=9;
		    break;
		case 10:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
		    t=10;
		    break;
		case 11:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
		    t=11;
		    break;
		case 12:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
		    t=12;
		    break;
		case 13:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
		    t=13;
		    break;
		case 14:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
		    t=14;
		    break;
		case 15:
			System.out.println("Why dont you try our special FAMILY SECTION\nDont worry we are not going to charge any extra for it\nThe FAMILY section is at the top floor\nYou can take the elevator over there");
		    t=15;
		    break;
		default:
			System.out.println("Sorry,but our restaurant can serve upto 15 people on each table");
			t=0;
			break;
		}
		return t;
	}
}
