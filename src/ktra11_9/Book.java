package ktra11_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Media implements InOut {

    List<Book> list = new ArrayList<Book>();
    private double page;
    private String Author;

    public Book(String name, double price, double page, String author) {
        super(name, price);
        this.page = page;
        Author = author;
    }

    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert page: ");
        page = scanner.nextDouble();
        System.out.println("Insert Author");
        Author = scanner.nextLine();

    }

    @Override
    public void show() {

    }


}
