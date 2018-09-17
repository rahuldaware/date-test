import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.Date;

/**
 * Created by rahuldaware on 9/16/18.
 */
public class Main {
    public static void main(String[] args) {
        //Get today's year
        System.out.println("Year: " + DateTime.now().year().get());
        System.out.println("Month: " + DateTime.now().monthOfYear().get());
        System.out.println("Date: " + DateTime.now().dayOfMonth().get());
        System.out.println("is leap year: " + DateTime.now().year().isLeap());

        //Generate a new DateTime object from a user inputted date
        int date = 10;
        int month = 2;
        int year = 1995;
        LocalDate sampleDate = new LocalDate(year, month, date);
        System.out.println("Day of Week" + sampleDate.dayOfWeek().getAsText());

        //Adding invalid date
        int date2 = 31;
        int month2 = 2;
        int year2 = 1998;
        // Use try catch block to detect errors in date like below
        try {
            LocalDate sampleDate2 = new LocalDate(year2,month2,date2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
