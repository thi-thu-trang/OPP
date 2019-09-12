package ktra11_9;

import java.util.Scanner;

public class Video extends Media implements InOut {
    private double time;

    public Video(String name, double price, double time) {
        super(name, price);
        this.time = time;
    }

    public Video() {

    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("time: ");
        time = scanner.nextDouble();
    }

    @Override
    public String show() {
        return "Video{" + super.show() +
                "time=" + time +
                '}';
    }


}
