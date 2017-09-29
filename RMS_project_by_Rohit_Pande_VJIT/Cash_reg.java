class Cash_reg 
{
	int[] table = new int[100];
	int[] amount = new int[100];
	int i=0;
	
	void add(int x, int b)
	{
		table[i]=x;
		amount[i]=b;
		i++;
		System.out.println("\nCash Amount of "+b
				+" has been registered in the CASH REGISTER,"
				+ "for the table number -> "+x);
	}
}
