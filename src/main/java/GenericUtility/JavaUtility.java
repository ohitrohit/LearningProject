package GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility {

	 /**
     * this method provide date and time
     * @return
     */
	public String getStringDate() {
		Date d = new Date();
		return d.toString();
	}
	/**
	 * this method provide date and time in a proper format
	 * @return
	 */
	public String getSystemDateInFormat() {
		
		Date d = new Date();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/YYYY hh.mm a");
		String finalDate = date.format(d);
		return finalDate;
	}
	/**
	 * this method will return a random number for every run
	 * @return
	 */
	
	
	
}
