package Date;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;


class DateCompare {
    public void dateCompare(int day, int month, int year) throws ParseException {
    	
    	
    	LocalDate today = LocalDate.now();
    	LocalDate date2 = LocalDate.of(year,month,day);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        
        Date date1 = Date.from(today.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date dateConverted = Date.from(date2.atStartOfDay(ZoneId.systemDefault()).toInstant());

        calendar1.setTime(date1);
        calendar2.setTime(dateConverted);

        System.out.println(calendar1.before(calendar2)); //false
        System.out.println(calendar1.equals(calendar2)); //true
        System.out.println(calendar1.after(calendar2)); //false
        
        //return calendar1.compareTo(calendar2);
    }
}