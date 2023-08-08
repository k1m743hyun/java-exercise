package src;

import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class CalculateWeekOfMonth {

  public static void main(String[] args) {
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
    try {
      String date = "2023-07-10";
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(dateFormat.parse(date));
      // calendar.setFirstDayOfWeek(Calendar.MONDAY);
      System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }
}