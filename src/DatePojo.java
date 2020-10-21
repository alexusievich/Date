import java.util.Objects;

public class DatePojo {
    private final int year;
    private final int month;
    private final int day;

    public DatePojo(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatePojo)) return false;
        DatePojo datePojo = (DatePojo) o;
        return getYear() == datePojo.getYear() &&
                getMonth() == datePojo.getMonth() &&
                getDay() == datePojo.getDay();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMonth(), getDay());
    }

    @Override
    public String toString() {
        return "DatePojo{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
