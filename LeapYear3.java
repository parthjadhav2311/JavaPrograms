public class LeapYear3
{

    public static void main(String[]args)
	{
	
	int year=1700;
	boolean leap=false;
	
	//if year is divided by 4
	
	if(year%4==0)
	
	
	{
	
	// if the year is century
	
	if(year%100==0)
	{
	
	// if year divide by 400
	
	if(year%400==0)
	
	{
	
	
	leap=false;
	
	}
	
	//if the year is not century
	else
	{
	leap=true;
	}
	
	if(leap)
	{
	
	System.out.println("leap year"+year);
	}
	
	else
	{
	System.out.println("it is not a leap year"+year);
	}
	}
	}
	}
	}