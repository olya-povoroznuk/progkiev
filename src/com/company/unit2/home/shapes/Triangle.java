package com.company.unit2.home.shapes;

public class Triangle extends Shape {

    private Point point1;

    private Point point2;

    private Point point3;

    public Triangle() {
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public double getPerimetr() {
        double a = Shape.getLength(point1, point2);
        double b = Shape.getLength(point2, point3);
        double c = Shape.getLength(point3, point1);
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = getPerimetr() / 2;
        double a = Shape.getLength(point1, point2);
        double b = Shape.getLength(point2, point3);
        double c = Shape.getLength(point3, point1);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
}
