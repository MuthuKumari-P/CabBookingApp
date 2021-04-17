package com.muthukumarip.cabbooking;

public class CabDetails {
	public static Boolean validateCabDetails(String cabType)
	{
		//Check the cab type is true or not
		if ((cabType.equalsIgnoreCase("MICRO")) || (cabType.equalsIgnoreCase("MINI")) || (cabType.equalsIgnoreCase("PRIME"))) 
		{
			return true;
		} 
		else
		{
			return false;
		}
			
	}

}
