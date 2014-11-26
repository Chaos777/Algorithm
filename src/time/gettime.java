package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class gettime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc = ( GregorianCalendar ) Calendar.getInstance();
		SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		gc.add( Calendar.DATE, 1 );
		System.out.println(f.format(gc.getTime()));
		Calendar cal=Calendar.getInstance();    
		System.out.println(f.format(cal.getTime()));

	}
	

}
