                                        //Date and Time:

// Refer javatpoint::::::::


import java.util.*;
import java.time.*;
class Program4
{
	public static void main(String[] args) 
	{
		System.out.println("Displaying Date and Time::");
		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		LocalTime time1=LocalTime.now();
		System.out.println(time1);
		Date d=new Date();
		System.out.println(d);
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
	}
}
