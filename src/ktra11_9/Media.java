package ktra11_9;

import java.util.Scanner;

public class Media implements InOut {
    protected String Name;
    protected double price;

    public Media(String name, double price) {
        this.Name = name;
        this.price = price;
    }

    public Media() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name: ");
        Name = scanner.nextLine();
        System.out.println("Insert price: ");
        price = scanner.nextDouble();
    }

    @Override
    public String show() {
        return "Media{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }


}
