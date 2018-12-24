package part2;

import java.util.*;

public class DateUtilities {
  
  public boolean validate(MyDate aDate) {
    return (aDate.getStartDate().compareTo(aDate.getEndDate()) <= 0);
  }
 
  public static int countTotalDays(MyDate aDate) {
    int totalDays = aDate.getEndDate().get(Calendar.DAY_OF_YEAR) - aDate.getStartDate().get(Calendar.DAY_OF_YEAR) + 1;
    return totalDays;
  }
  
}

