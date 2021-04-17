package com.muthukumarip.cabbooking;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {
	public static Boolean dateValidation(LocalDate currentDate,LocalDate journeyDate)
	{
		if (journeyDate.isBefore(currentDate)) //Check if the journey date is before the current date 

		{ 
			return false;
		}
		else if (journeyDate.isAfter(currentDate)) { //check if the journey date is after the current date
             return true;
		} 
		else if (journeyDate.equals(currentDate)) //Check if the current date is equals the journey date
		{
			return true;
		}
		return null;
	}
	public static Boolean timeValidation(LocalTime currentTime,LocalTime timeConversion, LocalDate currentDate,LocalDate journeyDate)
	{
		if (journeyDate.equals(currentDate))
		{
			if (timeConversion.isBefore(currentTime))//if the pick up time is before the current time
			{
				return false;
			}
			if (timeConversion.isAfter(currentTime)) //if the pick up time is after the current time 
			{ 							
				return true;
			}
			if (timeConversion.equals(currentTime)) //if the pick up time is equals the current time 
			{ 
				return true;
			}
		}
		return true;
	}

}
