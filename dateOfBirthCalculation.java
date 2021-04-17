package com.muthukumarip.dateofbirth;
import com.muthukumarip.cabbooking.*; //import the com.muthukumari.cabbooking packing in this package
import java.time.LocalDate;
import java.util.Scanner;

public class dateOfBirthCalculation {
	public static int validateDataOfBirth()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your DOB[YYYY-MM-DD]");
		String dob = sc.next(); //Get the User DOB as a String
		
		LocalDate dobConversion = LocalDate.parse(dob);//convert the String into integer
		int dobYear=dobConversion.getYear();
		LocalDate currentDate=LocalDate.now(); //Get the local date from the system
		int currentYear=currentDate.getYear(); //Extract year from the current date
		int age=AgeCalculation.ageCalculation(currentYear,dobYear);
					   
		return age;
		
		
	}
}
