package src;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class CalculateWeekOfMonth {

  public static void main(String[] args) {
    try {
    String date = "2023-06-26";
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new SimpleDateFormat("yyyy-mm-dd").parse(date));
    // calendar.setFirstDayOfWeek(Calendar.MONDAY);
    System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }
}