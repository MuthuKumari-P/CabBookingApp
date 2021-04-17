package com.muthukumarip.cabbooking;

public class PeakHourAmountCalculation {
	public static double amountCalculation(float kiloMeter)
	{
		double peakAmount=(double) (1.25*(kiloMeter/100)); //Calculate the peak hour amount
		return peakAmount;
	}

}
