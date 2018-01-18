package com.company.unit2.home;

import com.company.unit2.home.shapes.Circle;
import com.company.unit2.home.shapes.Point;
import com.company.unit2.home.shapes.Square;
import com.company.unit2.home.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setPoint1(new Point(1, 3));
        triangle.setPoint2(new Point(3, 2));
        triangle.setPoint3(new Point(2, 1));
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getArea());

        Square square = new Square();
        square.setPoint1(new Point(3, 3));
        square.setPoint2(new Point(3, 4));
        square.setPoint3(new Point(2, 1));
        square.setPoint4(new Point(3, 4));
        System.out.println(square.getPerimetr());
        System.out.println(square.getArea());

        Circle circle = new Circle();
        circle.setRadius(new Point(4, 3));
        circle.setCenter(new Point(2, 1));
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getArea());

    }
}
