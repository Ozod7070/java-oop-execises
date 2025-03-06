package oop2_8;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(1, 2, 3);
        System.out.println(time);
        time.setHour(4);
        time.setMinute(5);
        time.setSecond(6);
        System.out.println(time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        time.setTime(23, 59, 58);
        System.out.println(time);

        time.nextSecond();
        System.out.println("Next second: " + time);

        time.nextSecond();
        System.out.println("Next second: " + time);

        time.previosSecond();
        System.out.println("Previous second: " + time);

        time.previosSecond();
        System.out.println("Previous second: " + time);
    }
}
