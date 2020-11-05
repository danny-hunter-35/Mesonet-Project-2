import java.time.LocalDate;
import java.time.YearMonth;

/**
 * DateTimeInherit is a class that inherits the class named, DateTimeAbstract  
 */

public class DateTimeInherit extends DateTimeAbstract {

	public DateTimeInherit() {
		//default constructor
		//doesn't need anything though
	}
	
	public void daysOfAnyMonth(int monthOfYear, int theYear) {
		/* In the year 2020, for the 4th month: the first day is WEDNESDAY and the last day is THURSDAY		
		 */
		YearMonth yearMonth = YearMonth.of(theYear, monthOfYear);
		LocalDate firstDay = yearMonth.atDay(1);
		LocalDate lastDay = yearMonth.atEndOfMonth();
		
		System.out.print("In the year " + theYear + " , for the " + monthOfYear + "th month: the first day is "
				+ firstDay.getDayOfWeek() + " and the last day is " + lastDay.getDayOfWeek() + "\n");
	}
}