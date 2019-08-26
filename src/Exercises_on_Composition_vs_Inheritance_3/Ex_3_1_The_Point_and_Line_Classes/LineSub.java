package Exercises_on_Composition_vs_Inheritance_3.Ex_3_1_The_Point_and_Line_Classes;

public class LineSub extends Point {

    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line: (" + getX() + ", " + getY() + ") - ("
                + end.getX() + ", " + end.getY() + ")";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public void setBegin(Point begin) {
        this.setXY(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end.setXY(end.getX(), end.getY());
    }

    public int getBeginX() {
        return getX();
    }

    public void setBeginX(int x) {
        setX(x);
    }

    public int getBeginY() {
        return getY();
    }

    public void setBeginY(int y) {
        setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

}
