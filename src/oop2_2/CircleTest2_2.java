package oop2_2;

public class CircleTest2_2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1);
        Circle circle2 = new Circle(1.0);
        System.out.println(circle2);
        circle1.setRadius(2.2);
        System.out.println(circle1);
        double radius = circle1.getRadius();
        double area = circle1.getArea();
        double circumference = circle1.getCircumference();
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area);
        System.out.println("Circumference: "+circumference);
    }
}
