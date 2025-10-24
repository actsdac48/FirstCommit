package Date;

public class Date {
	private int day = 1;
	private int month = 1;
	private int year = 2025;
	
	public Date() {};
	
	public Date(int day, int month, int year) {
		setDate(day,month,year);
	}
	
	public void setDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	
	
	
	int [] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//int [] daysInMonthLeap = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	 private boolean isLeapYear(int year) {
	        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	 }
	 
	public void setDay(int addDays) {
		this.day = addDays;
	}
	 
	public void addDay(int addDays) {
		
		int totalDays = this.day + addDays;    //23+1025
		
		
		while(totalDays > daysInMonth[this.month]) {
			
			if(isLeapYear(this.year)) 
				daysInMonth[2] = 29;
			else
				daysInMonth[2] = 28;
			
			//fill the months
			totalDays -= daysInMonth[this.month];
			setMonth(this.month+1);
			
			//reset month and increase year
			if(this.month == 12) {
				this.month = 1;
				if(totalDays > daysInMonth[this.month]) {
					this.year = year + 1;
				}
			}
			
		}
		
		this.day = totalDays;
	}

	public void setMonth(int defaultMonth) {
		this.month = defaultMonth;
	}
	
	public void addMonth(int newMonth) {
		int newMonthValue = month + newMonth;
		if(newMonthValue > 12) {
			int count = newMonth % 12;   //3
			setMonth(count);
			
			int addYear = (int) Math.floor(newMonth / 12);
			setYear(year+addYear);
		}
		
		
		
    }
	
		/*
		 * if (newMonth < 12) {
        	int newMonthValue = month + newMonth; // 8 + 6 = 14
        	setMonth(newMonthValue);
        } else {
        	int yearsToAdd = (newMonth - 1) / 12;
            int adjustedMonth = ((newMonth - 1) % 12) + 1;

            setYear(this.year + yearsToAdd);
            this.month = adjustedMonth;
		*/
	

	public void setYear(int year) {
		if(year > 2500 || year < 1900)
			this.year = 2025;
		else
			this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	
	void display(){
		System.out.println("Date is : " + getDay() + "/" + getMonth() + "/" + getYear());
	}
	
	
}
