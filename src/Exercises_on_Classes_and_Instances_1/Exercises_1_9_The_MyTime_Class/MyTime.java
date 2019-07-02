package Exercises_on_Classes_and_Instances_1.Exercises_1_9_The_MyTime_Class;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);

    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.second = second;
            this.minute = minute;
        } else {
            System.out.println("vui long nhap lai");
        }

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 23) {
            this.hour = hour;
        } else {
            System.out.println("nhap sai");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("nhap sai");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("nhap sai");
        }
    }


    @Override
    public String toString() {
        return "HH: " + this.hour + " MM: " + this.minute + " SS: " + this.second;
    }

    public MyTime previousSecond() {
        if (this.second != 0) {
            this.second--;
        } else {
            this.setSecond(59);
            this.previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        if (this.minute == 0) {
            this.minute--;
        } else {
            this.setMinute(0);
            this.previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        if (this.hour != 0) {
            this.hour--;
        } else {
            this.setHour(23);
        }
        return this;
    }

    public MyTime nextSecond() {
        if (this.second > 60) {
            this.setSecond(this.second++);
        } else {
            this.setSecond(0);
            this.nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        if (this.minute > 60) {
            this.minute++;
        } else {
            this.setMinute(0);
            this.nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        if (this.hour > 23) {
            this.hour++;
        } else {
            this.setHour(0);
        }
        return this;
    }

}
