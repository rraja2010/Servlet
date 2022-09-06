package com.lara;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePicker
{
	public static boolean rangeDate() throws ParseException
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -1); // to get previous year add -1
		Date lastyearDate = cal.getTime();

		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String lastYearDate = formatter.format(lastyearDate);
		System.out.println("lastYearDate Year->" + lastYearDate);

		// converting lastYearDate string format date to Date format
		Date lastYearDate1 = (Date) formatter.parse(lastYearDate);

		Calendar cal1 = Calendar.getInstance();
		Date todayDate = cal1.getTime();
		String currentDate = formatter.format(todayDate);

		System.out.println("currentDate :" + currentDate);
		Date current1 = (Date) formatter.parse(currentDate);

		String inputDate = "11-02-2016";
		Date userInputDate = (Date) formatter.parse(inputDate);
		System.out.println("userInputDate->" + userInputDate);

		boolean status1 = !userInputDate.before(lastYearDate1);
		boolean status2 = !userInputDate.after(current1);

		System.out.println("status1-->" + status1 + "***" + "status2-->"
				+ status2);
		return !(userInputDate.before(lastYearDate1) || userInputDate
				.after(current1));
	}

	public static void main(String[] args)
	{
		try
		{
			boolean status = rangeDate();
			System.out.println("selected Date:->" + status);

		} catch (ParseException e1)
		{
			e1.printStackTrace();
		}
		Date date = null;
		Date my = new Date();
		String inputDate = "07-01-2013";
		try
		{
			DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			formatter.setLenient(false);
			date = formatter.parse(inputDate);
			System.out.println("my date");
			System.out.println("your Date " + date);
		} catch (ParseException e)
		{
			e.printStackTrace();
		}
	}
}
