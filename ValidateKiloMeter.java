package com.muthukumarip.cabbooking;

public class ValidateKiloMeter {
	public static int kiloMeterValidation(float kiloMeter)
	{
		//Check if the kilometer value is positive or negative
		if(kiloMeter>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
