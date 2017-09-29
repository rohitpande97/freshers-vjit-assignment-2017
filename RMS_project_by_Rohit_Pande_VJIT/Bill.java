class Bill 
{
int total=0;
void add_bill(int x)
{
	total=total+x;
}
int pay_bill(int y,int k)
{
	return y-(k*total);
}
}
