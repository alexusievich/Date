import java.util.zip.DataFormatException;

public class DateMain {

    public static void main(String[] args) throws DataFormatException {
        DateWorker a = new DateWorker();
        System.out.println(a.isLeapYear(1300));
        System.out.println(a.isValidDate(2020, 1, 1));
        System.out.println(a.getDayOfWeek(2020, 10, 21));
        System.out.println(a.toString(2020, 10, 21));
        System.out.println(a.countDays(2020, 1, 1));
    }
}
