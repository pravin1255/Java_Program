/**
 * 
 */
package JavaPrograms.Programs;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author PUNITH		
 *	https://www.javatpoint.com/java-get-current-date 
 */
public class DateTimeProgram {
	public static void main(String[] args) {
//		LocalDateTime dt=LocalDateTime.now();
//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d MMM uuuu HH:mm:ss");
//		System.out.println(formatter.format(dt));
//		System.out.println(dt.plusDays(90));
		
		//System.out.println(java.time.Clock.systemUTC().instant());//2020-07-16T09:27:35.519375700Z
		
//		java.util.Date dt=new java.util.Date();
//		System.out.println(dt);//Thu Jul 16 14:57:08 IST 2020
		
		Date dt=java.util.Calendar.getInstance().getTime();
		System.out.println(dt);//Thu Jul 16 15:04:18 IST 2020
		
		int dt1=java.util.Calendar.getInstance().getFirstDayOfWeek();
		System.out.println(dt1);
	}
}