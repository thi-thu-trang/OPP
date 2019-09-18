package test;

import java.util.*;

public class main {
    public static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3.Delete student by id");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. Exit");

        do {
            System.out.printf("please choose: ");
            int n = scanner.nextInt();
            switch (n) {
                case 1: {
                    inputStudent();
                    break;
                }
                case 2: {
                    int ID;
                    System.out.println("nhap id");
                    ID = scanner.nextInt();
                    System.out.println();
                    students.stream().filter(stu -> ID == (stu.getId())).findAny().ifPresent(timraroi -> {
                        timraroi = inputStudent();
                    });
                }
                break;
                case 3: {
                    Student student = new Student();
                    System.out.println("Nhap id: ");
                    int id = scanner.nextInt();
                    students.stream().filter(student1 -> id == (student1.getId())).findAny().ifPresent(timraroi -> {
                        students.remove(timraroi);
                    });
                    break;
                }
                case 4: {
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getGpa() > o2.getGpa() ? 1 : -1;
                        }
                    });
                }

                case 5: {
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    for (Student student : students) {
                        System.out.println(student.toString());
                    }
                    break;
                }
                case 6:
                    for (Student student1 : students) {
                        System.out.println(student1.toString());
                    }
                    break;


                case 0: {
                    System.exit(0);
                }
                default:
                    System.out.println("Ban da nhap sai!");
            }
        } while (true);
    }


    private static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Student id");
        student.setId(scanner.nextInt());
        System.out.println("Student name");
        student.setName(scanner.next());
        System.out.println("Input student age");
        student.setAge(scanner.nextInt());
        System.out.println("gpa");
        student.setGpa(scanner.nextInt());
        System.out.println("address");
        student.setAddress(scanner.next());
        return student;
    }
}
