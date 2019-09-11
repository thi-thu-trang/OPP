package ktra11_9;

import java.util.Scanner;

public class Book extends Media implements InOut {

    private double page;
    private String Author;

    public Book(String name, double price) {
        super(name, price);
    }

    public Book(String name, double price, double page, String author) {
        super(name, price);
        this.page = page;
        Author = author;
    }

    public Book() {
        super();
    }

    public double getPage() {
        return page;
    }

    public void setPage(double page) {
        this.page = page;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public void Input() {
        super.toString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert page: ");
        page = scanner.nextDouble();
        System.out.println("Insert Author");
        Author = scanner.nextLine();

    }


    @Override
    public String show() {
        return "Book{" +
                "page=" + page +
                ", Author='" + Author + '\'' +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}
