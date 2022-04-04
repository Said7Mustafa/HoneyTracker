package methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime_Comparing {
	public static int dateComparing( String date, String current) {
		Date n_Date = returnParsedDateTime(date, 0);
		Date c_Date = returnParsedDateTime(current, 0);
		if (n_Date.compareTo(c_Date) == -1)
			return -1;
		else if (n_Date.compareTo(c_Date) == 0)
			return 0;
		else
			return 1;
		
	}
	
	public static int timeComparing(String time, String current) {
		Date n_time = returnParsedDateTime(time, 1);
		Date c_time = returnParsedDateTime(current, 1);
		if (n_time.compareTo(c_time) == -1)
			return -1;
		else if (n_time.compareTo(c_time) == 0)
			return 0;
		else
			return 1;
		
	}

	private static Date returnParsedDateTime(String Date, int flag) {
		Date date = new Date();
		SimpleDateFormat sdf;
		try {
			if (flag == 0) {
				sdf = new SimpleDateFormat("dd/MM/yyyy");				
				date = sdf.parse(Date);
			}
			else {
				sdf = new SimpleDateFormat("KK:mm");
				date = sdf.parse(Date);
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
