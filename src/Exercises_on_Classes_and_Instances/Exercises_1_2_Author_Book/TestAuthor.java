package Exercises_on_Classes_and_Instances.Exercises_1_2_Author_Book;

import Exercise_The_Authour_and_Book_Classes1_2.Author;

public class TestAuthor {
    public static void main(String[] args) {

        Author user1 = new Author("NguyenThiThuTrang", "thithutrang1706@gmail.com", 'n');
        System.out.println(user1);

        user1.setEmail("thithutrang@gmail.com");

        System.out.println(user1);

        System.out.println("name : " + user1.getName());
        System.out.println("email : " + user1.getEmail());
        System.out.println("gender : " + user1.getGender());


    }
}
