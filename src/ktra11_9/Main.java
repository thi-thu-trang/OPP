package ktra11_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Media> mediaArrayList = new ArrayList<>();
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

                case 2:
                    Video video = new Video();
                    video.Input();
                    mediaArrayList.add(video);

            }
        }
        while (true);
        {
            System.out.println("choice next ");
            int m = scanner.nextInt();
                    case 3:
                        for (Media media : mediaArrayList) {
                            media.toString();
                        }
                    case 4:
                        ArrayList<Media> danhsach = new ArrayList<>();
                        for (int i = 0; i < m; i++) {
                            scanner.nextLine();
                            Media x = new Media();
                            System.out.println("name media: ");
                            x.Name = scanner.nextLine();
                            System.out.println("price: ");
                            x.price = scanner.nextDouble();
                            danhsach.add(x);
                        }
                        Collections.sort(danhsach, new Comparator<Media>() {
                            @Override
                            public int compare(Media o1, Media o2) {
                                if (o1.Name.compareTo(o2.Name) == 0) {
                                    if (o1.price == o1.price)
                                        return 0;
                                    else if (o1.price > o2.price) {
                                        return 1;
                                    } else {
                                        return -1;
                                    }
                                } else
                                    return o1.Name.compareTo(o2.Name);
                            }
                        });

            case 5:
                do {
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("ban da nhap sai.");


                }
            }
        }