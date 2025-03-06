package oop2_8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.err.println("Kiritgan soningiz 0 - 23 oraligida bolishi kerak!");
        }
    }

    public void setMinute(int minute) {
        if (minute > 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.err.println("Kiritgan soningiz 0 - 59 oraligida bolishi kerak!");
        }
    }

    public void setSecond(int second) {
        if (second > 0 && second < 60) {
            this.second = second;
        } else {
            System.err.println("Kiritgan soningiz 0 - 59 oraligida bolishi kerak!");
        }
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    public void nextMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
            if (hour == 24) {
                hour = 0;
            }
        }
    }

    public void previosSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
    }

    public void previosMinute() {
        minute--;
        if (minute < 0) {
            minute = 59;
            hour--;
            if (hour < 0) {
                hour = 23;
            }
        }
    }
}
