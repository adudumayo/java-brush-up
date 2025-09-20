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

    // Let us get into accessor methods rn
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public double getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(double second) {
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
