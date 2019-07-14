package Exercises_on_Classes_and_Instances.Exercises_1_11_Book_and_Author_Classes_Again;

public class TestBook {
    public static void main(String[] args) {
        //Author [] authors = new Author[2];
        Author[] authors = new Author[2];
        authors[0] = new Author("thutrang", "thithutrang1707@gmai.com", 'n');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        //Book javaDummy = new Book("java for DUmmy",19.99,99);
        Book trang = new Book("java", authors, 19.90, 2009);
        System.out.println(trang);
        System.out.println("the authors are: ");
        trang.printAuthours();


    }
}
