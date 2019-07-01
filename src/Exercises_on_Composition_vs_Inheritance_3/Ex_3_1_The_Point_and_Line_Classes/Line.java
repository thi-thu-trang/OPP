package Exercises_on_Composition_vs_Inheritance_3.Ex_3_1_The_Point_and_Line_Classes;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        this.end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        this.end.getY();
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public void setBeginy(int y) {
        this.begin.getY();
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
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
