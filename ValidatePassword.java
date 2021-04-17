package com.muthukumarip.cabbooking;

public class ValidatePassword {
	public static Boolean checkPassword(String password)
	{
		//Validate the password with condition
		if(password.length()==8) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
