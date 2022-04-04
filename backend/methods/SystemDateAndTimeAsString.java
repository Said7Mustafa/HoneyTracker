package methods;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SystemDateAndTimeAsString {
//	private static final long serialVersionUID = 111L;
	private static String date;
	private static String time;
	private static LocalDate localDate;
	private static LocalTime localTime;
	
	private static DateTimeFormatter Dformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static DateTimeFormatter Tformat = DateTimeFormatter.ofPattern("kk:mm");
	


	public static String getDate() {
		localDate = LocalDate.now();
		date = localDate.format(Dformat);
		return date;
	}


	public static String getTime() {
		localTime = LocalTime.now();
		localTime = localTime.minusMinutes(2);
		time = localTime.format(Tformat);
		return time;
	}
}
