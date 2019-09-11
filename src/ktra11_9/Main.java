package ktra11_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("media");
        int n = scanner.nextInt();
        ArrayList<Media> danhsach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
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
                return (o1.Name.compareTo(o2.Name));
            }
        });

        System.out.println("danh sách sắp xếp media theo bảng chữ cái: ");
        for (int i = 0; i < danhsach.size(); i++) {
            System.out.println("name: " + danhsach.get(i).Name + "price: " + danhsach.get(i).price);
        }
    }

}
