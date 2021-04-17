package com.muthukumarip.cabbooking;

public class ValidateMobileNumber {
	public static Boolean checkNumber(long mobileNumber)
	{
		String mobileNumberString=String.valueOf(mobileNumber);
		//Validate the mobile number with condition
		if((mobileNumberString.length()!=10)|| (mobileNumberString.charAt(0)>='0' && mobileNumberString.charAt(0)<='5'))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
