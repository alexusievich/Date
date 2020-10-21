import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.zip.DataFormatException;

public class DateWorker {

    boolean isLeapYear(int year) {

        if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 > 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }

    }


    boolean isValidDate(int year, int month, int day) {

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        calendar.setLenient(false);
        try {
            calendar.getTime();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    int getDayOfWeek(int year, int month, int day) throws DataFormatException {

        HashMap<Integer, Integer> Week = new HashMap<>();
        Week.put(1, 6);
        Week.put(2, 0);
        Week.put(3, 1);
        Week.put(4, 2);
        Week.put(5, 3);
        Week.put(6, 4);
        Week.put(7, 5);

        if (isValidDate(year, month , day)) {
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            return Week.get(calendar.get(GregorianCalendar.DAY_OF_WEEK));
        } else {
            throw new DataFormatException();
        }

    }


    String toString(int year, int month, int day) throws DataFormatException {

        HashMap<Integer, String> Month = new HashMap<>();
        Month.put(1, " Jan ");
        Month.put(2, " Feb ");
        Month.put(3, " Mar ");
        Month.put(4, " Apr ");
        Month.put(5, " May ");
        Month.put(6, " Jun ");
        Month.put(7, " Jul ");
        Month.put(8, " Aug ");
        Month.put(9, " Sep ");
        Month.put(10, " Oct ");
        Month.put(11, " Nov ");
        Month.put(12, " Dec ");

        HashMap<Integer, String> WeekDay = new HashMap<>();
        WeekDay.put(0, "Monday ");
        WeekDay.put(1, "Tuesday ");
        WeekDay.put(2, "Wednesday ");
        WeekDay.put(3, "Thursday ");
        WeekDay.put(4, "Friday ");
        WeekDay.put(5, "Saturday ");
        WeekDay.put(6, "Sunday ");

        if (isValidDate(year, month, day)) {
            return WeekDay.get(this.getDayOfWeek(year, 10, day)) + day + Month.get(10) + year;
        } else {
            throw new DataFormatException();
        }
    }


    int countDays(int year, int month, int day) throws DataFormatException {

        if (isValidDate(year, month, day)) {
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            Calendar calendar1 = Calendar.getInstance();
            Date dateBefore = calendar.getTime();
            Date dateAfter = calendar1.getTime();
            long msTimeDistance = dateAfter.getTime() - dateBefore.getTime();
            long msDay = 24 * 60 * 60 * 1000;
            return (int) (msTimeDistance / msDay);
        } else {
            throw new DataFormatException();
        }
    }
}
