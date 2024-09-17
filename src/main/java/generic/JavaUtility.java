package generic;

import java.util.Calendar;
import java.util.Date;
public class JavaUtility {
	public Date calendarData() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		return date;
	}
	
}
