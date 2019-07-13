package Exercises_on_Classes_and_Instances.Exercises_1_12_Book_And_Author_Class_Once_More;

public class TestBook {
    public static void main(String[] args) {
        Book javaDummy = new Book("java for Dummy", 19.99, 99);
        //Book javaDummy1 = new Book("java",200.19);
        javaDummy.addAuthor(new Author("thithutrang", "thu@gmail.com", 'f'));
        //System.out.println(javaDummy1);
        System.out.println(javaDummy);
        System.out.println("The authours are: ");
        javaDummy.printAuthours();

        javaDummy.addAuthor(new Author("nguyen thi thu trang", "thithutrang.1706@gmail.com", 'n'));
        javaDummy.addAuthor(new Author("thutrang", "thutrang@gmail.com", 'm'));
        System.out.println(javaDummy);//to.string()
        System.out.println("The authours are: ");
        javaDummy.printAuthours();

    }
}
