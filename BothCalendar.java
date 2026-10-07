import java.util.Calendar;
import java.util.GregorianCalendar;

class BothCalendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println("Calendar:");
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));

        System.out.println("\nGregorian Calendar:");
        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (gc.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
