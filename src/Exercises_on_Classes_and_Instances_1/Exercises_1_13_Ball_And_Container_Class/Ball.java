package Exercises_on_Classes_and_Instances_1.Exercises_1_13_Ball_And_Container_Class;

public class Ball {
    private float x, y, xDelta, yDelta;
    private int radius;


    public Ball(int x, int y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        //Δx = d × cos(θ)
        // Δy = ­d × sin(θ)
        this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = speed * (float) Math.cos(Math.toRadians(direction));

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return (int) Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }

    public int getDirection() {
        return (int) Math.toDegrees(Math.atan2(-yDelta, xDelta));

    }

    public void SetXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        xDelta += xDelta;
        yDelta += yDelta;
    }

    public void reflextHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public String toString() {
        return "Ball at (" + (int) x + "," + (int) y + ") of velocity: " + getSpeed() + "," + getDirection();
    }
}
/*public void draw(Graphics g) {
        g.setColor(Color.WHITE);

        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new java.awt.geom.Ellipse2D.Double(
          (int)(x - radius), (int)(y - radius)
        , (int)(2 * radius), (int)(2 * radius)
        ));
    }

 */


