package com.company.unit2.home.shapes;

public class Circle extends Shape {

    private Point center;

    private Point radius;

    public Circle() {
    }

    public Circle(Point center, Point radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        double r = Shape.getLength(radius, center);
        return 2 * r * Math.PI;
    }

    @Override
    public double getArea() {
        double r = Shape.getLength(radius, center);
        return Math.PI * Math.pow(r, 2);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getRadius() {
        return radius;
    }

    public void setRadius(Point radius) {
        this.radius = radius;
    }
}
