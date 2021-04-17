package com.muthukumarip.cabbooking;

public class GstCalculation {
	final static int gstValue=7;// Set the GST value as final
	public static double calculateGst(float amount)
	{
		double gstAmount=(double)((amount/100)*gstValue); //Calculate the gst value
		return gstAmount;
	}
	public static double calculateAmount(double amount)
	{
		double amount1=(amount/100)*50; //Calculate the discount value
		return amount1;
	}

}
