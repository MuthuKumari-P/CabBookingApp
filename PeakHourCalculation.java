package com.muthukumarip.cabbooking;

import java.time.LocalTime;

public class PeakHourCalculation {
	public static int peakHourValidation(LocalTime time)
	{
		int hour=time.getHour(); //Extract hour from the user specified time
		int var=(hour>=17&&hour<=19) ? 1:  0; //check the hour is between 5PM to 7PM
		return var;
	}

}
