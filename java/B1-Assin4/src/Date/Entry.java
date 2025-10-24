package Date;

import java.io.Console;
import java.time.LocalDate;

import Other.GetInput;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Entry {

	public static void main(String[] args) throws ParseException {
		
		
		
		//Date secondDate = new Date(12,2,2026);
		
		//secondDate.setDate(13, 2, 2026);
		
		//System.out.println("Date is : " + objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
		
		/*
		LocalDate today = LocalDate.now();
		System.out.println("Today's date: " + today);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date date2 = simpleDateFormat.parse("2022-12-06");
		*/
		
		
		Date ob = new Date();
		DateCompare obDateCompare = new DateCompare();
		
		
	
		int ch;
		do {
			System.out.println("1. Set date\n2. Add Days\n3. Add Month\n4. Add Years\n5. Compare Date\n6. Exit");
			
			ch = GetInput.getInt();
			
			switch(ch) { 
				case 1 : {
							System.out.println("Enter the day : ");
							int day = GetInput.getInt();
							if(day > 31) {
								System.out.println("Enter the day : ");
								day = GetInput.getInt();
							}

							System.out.println("Enter the month : ");
							int month = GetInput.getInt();
							if(month > 12) {
								System.out.println("Enter the month properly : ");
								month = GetInput.getInt();
							}

							System.out.println("Enter the year : ");
							int year = GetInput.getInt();


							ob.setDate(day, month, year);
							
						} break;
				
				case 2 : {
					
					System.out.println("Enter How many days you want to add : ");
					int addDays = GetInput.getInt();
					
					ob.addDay(addDays);
					System.out.println("Date is : " + ob.getDay() + "/" + ob.getMonth() + "/" + ob.getYear());
				} break;
				
				case 3 : {
					System.out.println("Enter How many months you want to add : ");
					int addMonths = GetInput.getInt();
					
					ob.addMonth(addMonths);
					System.out.println("Date is : " + ob.getDay() + "/" + ob.getMonth() + "/" + ob.getYear());
				} break;
				
				case 4 : {
					System.out.println("Enter How many years you want to add : ");
					int addYears = GetInput.getInt();
					
					ob.setMonth(addYears);
					System.out.println("Date is : " + ob.getDay() + "/" + ob.getMonth() + "/" + ob.getYear());
				} break;
				
				case 5 : {
					System.out.println("Enter the date to be compare : ");
					System.out.println("Enter the day : ");
					int day = GetInput.getInt();

					System.out.println("Enter the month : ");
					int month = GetInput.getInt();

					System.out.println("Enter the year : ");
					int year = GetInput.getInt();

					
					obDateCompare.dateCompare(day, month, year);
				} break;
				
				default : {
					System.out.println("Thankyou...............!!");
				} break;
			}

		}while(ch<6);

	}

}
