package Exercises_on_Classes_and_Instances.Exercises_1_13_Ball_And_Container_Class;

public class Container {
    private int x1, y1, x2, y2;

    public Container(int x, int y, int width, int height) {
        set(x, y, width, height);
    }

    public void set(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width - 1;
        y2 = y1 + height - 1;
    }

    public int getX() {
        return x1;
    }

    public void setX(int x) {
        x1 = x;
    }

    public int getY() {
        return y1;
    }

    public void setY(int y) {
        y1 = y;
    }

    public int getWidth() {
        return (x2 - x1 + 1);
    }

    public void setWidth(int width) {
        x2 = x1 + width - 1;
    }

    public int getHeight() {
        return (y2 - y1 + 1);
    }

    public void setHeight(int height) {
        y2 = y1 + height - 1;
    }

    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() + ball.getRadius() >= this.x2) {
            ball.reflextHorizontal();
            //phan xa ngang
            return true;
        }

        if (ball.getY() - ball.getRadius() <= this.y1 ||
                ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            return true;
        }

        return false;
    }

    public String toString() {
        return "Container at (" + x1 + "," + y1 + ") to (" + x2 + ", " + y2 + ")";
    }
}


