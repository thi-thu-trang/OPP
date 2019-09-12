package ktra11_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Media> mediaArrayList = new ArrayList<>();

    public static void Sort() {
        Collections.sort(mediaArrayList, new Comparator<Media>() {
            @Override
            public int compare(Media o1, Media o2) {
                if (o1.Name.compareTo(o2.Name) == 0) {
                    if (o1.price == o2.price)
                        return 0;
                    else if (o1.price > o2.price) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else
                    return o1.Name.compareTo(o2.Name);
            }
        });
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*******menu***********");
        System.out.println("1: addbook");
        System.out.println("2: addvideo");
        System.out.println("3: Show");
        System.out.println("4: Sort ");
        System.out.println("5: Exit");


        do {
            System.out.println("choice");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    Book book = new Book();
                    book.Input();
                    mediaArrayList.add(book);
                    break;
                case 2:
                    Video video = new Video();
                    video.Input();
                    mediaArrayList.add(video);

                    break;
                case 3:
                    for (Media media : mediaArrayList) {
                        System.out.println(media.show());
                    }
                    break;
                case 4:
                    Sort();
                    for (Media media : mediaArrayList) {
                        System.out.println(media.show());
                    }
                    break;
                case 5:
                    System.out.println("Nhap so luong sp: ");
                    int x = scanner.nextInt();
                    for (int i = 0; i < x; i++) {
                        Media media = new Media();
                        System.out.println("sp thu " + i + ":");
                        media.Input();
                        mediaArrayList.add(media);
                    }
                    Sort();
                    for (Media media : mediaArrayList) {
                        System.out.println(media.show());
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("ban da nhap sai.");


            }
        } while (true);
    }

}
