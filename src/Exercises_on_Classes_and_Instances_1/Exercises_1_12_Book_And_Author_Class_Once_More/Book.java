package Exercises_on_Classes_and_Instances_1.Exercises_1_12_Book_And_Author_Class_Once_More;

public class Book {
    private String name;
    private double price;
    private int qtyInStock = 0;
    private Author[] authors = new Author[5];
    private int numAuthors = 0;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book(String name, double price, int qtyInStock) {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public int getNumAuthors() {
        return numAuthors;
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
        return name + " by " + this.numAuthors + " authors " + price + " " + qtyInStock;
    }


    public void addAuthor(Author author) {
        authors[numAuthors] = author;
        ++numAuthors;
    }

    public void printAuthours() {
        for (Author a : this.authors) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }

    public boolean removeAuthorByName(String authorName) {
        for (Author a : this.authors) {
            if (a.getName().equals(authorName)) {
                a = null;
                return true;
            }
        }
        return false;
    }
}
