package com.muthukumarip.cabbooking;

public class TotalAmount {
	
	public static double amountWithGst(float amount,double gstValue )
	{
		double TotalAmount=(double) amount+gstValue; //Calculate the total amount with GST
		return TotalAmount;
	}

}
