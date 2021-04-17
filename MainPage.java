package com.muthukumarip.cabbooking;
import com.muthukumarip.dateofbirth.*; //import the com.muthukumarip.dateofbirth package in this package
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class MainPage 
	{
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number"); 
		long mobileNumber=sc.nextLong(); //Get the mobile number from the user
		Boolean validNumber=ValidateMobileNumber.checkNumber(mobileNumber); //Call the ValidateMobileNumber class by checkNumber method
		if(validNumber==true) //Check the ValidNumber is true or not
		{
			System.out.println("Enter the Password");
			String password=sc.next(); //Get the Password from the user
			Boolean validPassword=ValidatePassword.checkPassword(password);
			if(validPassword==true)
			{
				CabTypes.cabTypes(); 
				System.out.println("Please enter you want which type of Cab");
				String cabType = sc.next(); //Get the cab type from the user
				Boolean validCab=CabDetails.validateCabDetails(cabType);
				if(validCab==true)
				{
					System.out.println("Howmany kilo meters you want to go in this Cab");
					float kiloMeter = sc.nextFloat(); //Get the kilometer from the user
					int validKiloMeter=ValidateKiloMeter.kiloMeterValidation(kiloMeter);
					if(validKiloMeter==1) 
					{
						float amount=CalculateAmount.amountCalculation(kiloMeter, cabType);
						double gstAmount=GstCalculation.calculateGst(amount);
						System.out.println("GST Amount=Rs."+gstAmount+"/-"); //Display the GST amount
						double totalAmount=TotalAmount.amountWithGst(amount,gstAmount);
						System.out.println("Your Total bill Amount with GST Rs."+totalAmount+"/-");
						System.out.println("Enter the Journey Date [YYYY-MM-DD]"); //YYYY-MM-DD
						String date = sc.next();
						LocalDate dateConversion = LocalDate.parse(date);
						LocalDate currentDate = LocalDate.now();
						Boolean validDate=DateTime.dateValidation(currentDate,dateConversion);
						if(validDate==true)
						{
							System.out.println("Enter cab pickup time(HH:MM:SS)"); //Time format= Hour:Minute:Seconds[HH:MM:SS]
							String time = sc.next(); //Get the pickup time from the user
							LocalTime timeConversion = LocalTime.parse(time); //parse the String to the integer
							LocalTime currentTime = LocalTime.now();
							Boolean validTime=DateTime.timeValidation(currentTime, timeConversion, currentDate, dateConversion);
							if(validTime==true)
							{
								int peakHour=PeakHourCalculation.peakHourValidation(timeConversion);
								if(peakHour==1)
								{
									System.out.println("This is Peak Hour");
									double peakHourAmount=PeakHourAmountCalculation.amountCalculation(kiloMeter);
									System.out.println("So your extra amount is Rs."+peakHourAmount+"/-");
									double totalAmountByPeakHour=TotalAmount.amountWithGst(amount, peakHourAmount);
									System.out.println("Total amount with peak hour is Rs."+totalAmountByPeakHour+"/-");
									int age=dateOfBirthCalculation.validateDataOfBirth();
									if(age>60)
									{
									double seniorAmount=GstCalculation.calculateAmount(totalAmountByPeakHour);
								    System.out.println("You are a senior person so your Bill amount is with peak hour Rs."+seniorAmount+"/-\n*******ENJOY YOUR JOURNEY*******");
								    }
									/*** 
									 * Whenever the if condition is fails the program
									 *  control go to the below 
									 * statement
									 */
								    else
								    {
								    	System.out.println("You are not a senior person\n*******ENJOY YOUR JOURNEY*******");
								    }
								}
								else
								{
									System.out.println("This is not a Peak Hour");
									int age=dateOfBirthCalculation.validateDataOfBirth();
									if(age>60)
									{
									double seniorAmount=GstCalculation.calculateAmount(totalAmount);
								    System.out.println("You are a senior person so your Bill amount is Rs."+seniorAmount+"/-\n*******ENJOY YOUR JOURNEY*******");
								    }
								    else
								    {
								    	System.out.println("You are not a senior person\n*******ENJOY YOUR JOURNEY*******");
								    }
					
								}
								
							}
							else
							{
								System.out.println("Invalid Time");
							}
						}
						else
						{
							System.out.println("Invalid Date");
						}
					}
					else
					{
						System.out.println("Invalid Kilometer(Please enter the positive value)");
					}
					
				}
				else
				{
					System.out.println("Invalid cab type");
				}
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid mobile number");
		}
		sc.close();
	}

}