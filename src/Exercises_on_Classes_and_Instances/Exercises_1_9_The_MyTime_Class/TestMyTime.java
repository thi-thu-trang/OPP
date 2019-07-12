package Exercises_on_Classes_and_Instances.Exercises_1_9_The_MyTime_Class;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime lan1 = new MyTime(0, 1, 1);
        System.out.println(lan1);
        //stem.out.println(lan1.previousSecond());
        //System.out.println(lan1.previousMinute());
        System.out.println(lan1.nextSecond());
    }
}
