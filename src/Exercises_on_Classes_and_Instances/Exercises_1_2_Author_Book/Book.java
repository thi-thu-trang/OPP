package Exercises_on_Classes_and_Instances.Exercises_1_2_Author_Book;

public class Book {
    private String name;
    private double price;
    private int qtyInStock = 0;
    private Author author;

    public Book(String name, double price, Author author) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthourEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    public String toString() {
        return name + '\t' + "by" + '\t' + author;
    }

}
