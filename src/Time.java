import java.util.Calendar;

public class Time {
    int millis = 999;
    public void getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        System.out.println(calendar.getTime());
    }
}
