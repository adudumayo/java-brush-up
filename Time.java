public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public static void main(String [] args) {
        System.out.println("How To Think Like A Computer Scientist");

        Time time = new Time();

        System.out.println(time);
    }
}
