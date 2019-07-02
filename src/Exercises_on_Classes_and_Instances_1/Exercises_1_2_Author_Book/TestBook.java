package Exercises_on_Classes_and_Instances_1.Exercises_1_2_Author_Book;

public class TestBook {
    public static void main(String[] args) {
        Author anAuthor = new Author("thutrang", "thithutrang1706@gmail.com", 'n');
        Book aBook = new Book("java for dummy", anAuthor, 19.95, 1000);
        Book aBook1 = new Book("java", 200.3, new Author("thu trang", "thithutrang1706@gmail.com", 'n'));
        System.out.println(aBook);
        System.out.println(aBook1);
        aBook.setPrice(199.95);
        aBook.setQtyInStock(25000);
        System.out.println(aBook.getPrice() + " " + aBook.getQtyInStock());
        Book anotherBook = new Book("more java for dummy", new Author("thu trang", "thithutrang@gmail.com", 'n'), 29.98, 20000);
        System.out.println(anotherBook);
        aBook.setPrice(17.231);
        aBook.setQtyInStock(202132);
        System.out.println(aBook.getPrice() + " " + aBook.getQtyInStock());
        System.out.println("try1:");
        System.out.println(aBook.getAuthor().getName() + " " + aBook.getAuthor().getEmail());
        System.out.println("try2:");
        System.out.println(aBook.getAuthorName() + " " + aBook.getAuthourEmail() + " " + aBook.getAuthorGender());

    }
}
