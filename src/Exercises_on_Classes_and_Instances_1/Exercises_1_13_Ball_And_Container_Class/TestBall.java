package Exercises_on_Classes_and_Instances_1.Exercises_1_13_Ball_And_Container_Class;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; step++) {
            ball.move();

        }
        System.out.println(ball);

    }
}
