package Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBook {

    public static Book insertBook(int id) {
        Scanner input = new Scanner(System.in);
        String Name;
        String PublishDate;
        String Author;
        String Launguage;
        float AveragePrice;
        System.out.println("Insert name of  Book: ");
        Name = input.nextLine();
        System.out.println("Insert pubishDate of  Book: ");
        PublishDate = input.nextLine();
        System.out.println("Insert author of  Book: ");
        Author = input.nextLine();
        System.out.println("Insert launguage of  Book: ");
        Launguage = input.nextLine();
        System.out.println("Insert averagePrice of  Book: ");
        AveragePrice = input.nextFloat();
        Book book = new Book(id, Name, PublishDate, Author, AveragePrice);
        return book;
    }

    public static float average(List<Book> list) {
        float result = 0;
        for (Book book : list) {
            result += book.getAveragePrice();
        }
        return result / list.size();
    }

    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        int Id = 0;
        boolean logic = true;
        while (logic) {
            int numberChose = 0;
            System.out.println("1.Insert new Book");
            System.out.println("2.View List of Book");
            System.out.println("3.Average Price");
            System.out.println("4.Exit");
            Scanner input = new Scanner(System.in);
            numberChose = input.nextInt();
            switch (numberChose) {
                case 1: {
                    Book book = insertBook(Id);
                    list.add(book);
                    Id++;
                    break;
                }
                case 2: {
                    for (Book book : list) {
                        book.Displaỵ();
                    }
                    break;
                }
                case 3: {
                    System.out.println(".Average:  " + average(list));
                    break;
                }
                case 4:
                    logic = false;
                    break;
                default:
                    System.out.println("Number you chose incorect !!!");
            }
        }
    }
}


