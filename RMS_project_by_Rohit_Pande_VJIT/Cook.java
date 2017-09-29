class Cook 
{
	int c;
	Server ramu = new Server();
	void veg(int dish)
	{
		c=dish;
		ramu.serve(c);
	}
	void nonveg(int dish)
	{
		c=dish;
		ramu.serve(c);
	}
	void start(int dish)
	{
		c=dish;
		ramu.serve(c);
	}
	void p()
	{
		ramu.view_order();
	}
}