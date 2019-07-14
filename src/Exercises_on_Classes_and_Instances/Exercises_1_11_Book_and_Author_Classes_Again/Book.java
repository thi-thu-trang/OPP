package Exercises_on_Classes_and_Instances.Exercises_1_11_Book_and_Author_Classes_Again;


public class Book {
    private String name;
    private double price;
    private int qtyInStock = 0;
    private Author[] authors;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;

    }

    public Book(String name, Author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;

    }

    public Author[] getAuthors() {
        return authors;
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

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " by " + this.authors.length + " authors ";// + price + " " + qtyInStock;
    }

    public void printAuthours() {
        for (Author a : this.authors) {
            System.out.println(a);
        }
    }
}

