package test;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hour = seconds / 3600;
        seconds -= hour * 3600;
        int min = seconds / 60;
        seconds -= min * 60;
        String hh = hour < 10 ? "0" + Integer.toString(hour) : Integer.toString(hour);
        String mm = min < 10 ? "0" + Integer.toString(min) : Integer.toString(min);
        String ss = seconds < 10 ? "0" + Integer.toString(seconds) : Integer.toString(seconds);
        return hh + ":" + mm + ":" + ss;
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
    }

}
