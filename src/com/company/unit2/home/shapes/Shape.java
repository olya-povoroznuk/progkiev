package com.company.unit2.home.shapes;

public abstract class Shape {

    public static double getLength(Point start, Point end) {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2)
                + Math.pow(end.getY() - start.getY(), 2));
    }

    public abstract double getPerimetr();

    public abstract double getArea();
}
