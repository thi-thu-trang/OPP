package ktra11_9;

import java.util.Scanner;

public class Video extends Media implements InOut {
    private double time;

    public Video(String name, double price, double time) {
        super(name, price);
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public void Input() {
        super.toString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("time: ");
        time = scanner.nextDouble();
    }

    @Override
    public String show() {
        return "Video{" +
                "time=" + time +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }




}
