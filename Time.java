public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void main(String [] args) {
        System.out.println("How To Think Like A Computer Scientist");

        Time time = new Time();
        Time time2 = new Time(3, 4, 3.0);

        System.out.println(time);
        System.out.println(time2);
    }
}
