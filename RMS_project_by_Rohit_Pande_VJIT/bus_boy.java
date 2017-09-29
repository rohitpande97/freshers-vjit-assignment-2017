import java.util.Scanner;
class Bus_boy
{
 int b;
 Scanner s = new Scanner(System.in);
 void greet()
 {
 System.out.println("\n\nBus boy here!\nwhich water will you prefer to have?\n1.Bisleri\n2.Aquafina\n3.Bailey");
 b=s.nextInt();
 }
 void serve()
 {
	 switch(b)
	 {
	 case 1:
		 System.out.println("\nServing Bisleri\n");
		 break;
	 case 2:
		 System.out.println("\nServing Aquafina\n");
		 break;
	 case 3:
		 System.out.println("\nServing Bailey");
		 break;
	 }
	 
 }
 void clean (int t)
 {
	 System.out.println("\n\nBus boy is cleaning table number "+t+"\n\n"); 
 }
 
}
