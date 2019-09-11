package ktra11_9;

import java.util.Scanner;

public class Video extends Media implements InOut {
    private double time;

    public Video(String name, double price, double time) {
        super(name, price);
        this.time = time;
    }

    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("time: ");
        time = scanner.nextDouble();
    }

    @Override
    public void show() {

    }


}
