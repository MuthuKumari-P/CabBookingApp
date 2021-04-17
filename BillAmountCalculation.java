package com.muthukumarip.cabbooking;

public class BillAmountCalculation {
	public static float amountCalculationByKiloMeter(int price,float kiloMeter)
	{
		float amount=(float)(price*kiloMeter); //Calculate the amount by kilometer
		return amount;
	}

}
