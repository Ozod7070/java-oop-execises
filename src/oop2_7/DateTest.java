package oop2_7;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1, 2, 2014);
        System.out.println(date);
        date.setMonth(12);
        date.setDay(9);
        date.setYear(2099);
        System.out.println(date);
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());
        date.setDate(6, 3, 2025);
        System.out.println(date);
    }
}
