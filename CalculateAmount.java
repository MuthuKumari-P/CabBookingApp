package com.muthukumarip.cabbooking;

public class CalculateAmount {
	static int value=0;
	public static float amountCalculation(float kiloMeter, String cabType)
	{

		//check the cab types and set the value
		if(cabType.equalsIgnoreCase("MICRO"))
		{
			value=1;
		}
		else if(cabType.equalsIgnoreCase("MINI"))
		{
			value=2;
		}
		else if(cabType.equalsIgnoreCase("PRIME"))
		{
			value=3;
		}
		//use the switch case to calculate bill amount by kilometer
		switch (value)
		{
			case 1:
			{
				float amount=BillAmountCalculation.amountCalculationByKiloMeter(10,kiloMeter);
				System.out.println("Your Bill Amount=Rs."+amount+"/-");
				return amount;
			}
			case 2:
			{
				float amount=BillAmountCalculation.amountCalculationByKiloMeter(15,kiloMeter);
				System.out.println("Your Bill Amount=Rs."+amount+"/-");
				return amount;
			}
			case 3:
			{
				float amount=BillAmountCalculation.amountCalculationByKiloMeter(20,kiloMeter);
				System.out.println("Your Bill Amount=Rs."+amount+"/-");
				return amount;
			}
			default:
			{
				break;
			}
		}
		return 0;
		}
	}
