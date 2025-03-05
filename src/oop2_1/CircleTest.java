package oop2_1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        double radius1 = circle1.getRadius();
        double area1 = circle1.getArea();
        Circle circle2 = new Circle(2);
        double radius2 = circle2.getRadius();
        double area2 = circle2.getArea();
        System.out.println("Radius: "+radius1);
        System.out.println("Yuzasi: "+area1);
        System.out.println("Radius 2: "+radius2);
        System.out.println("Yuzasi 2: "+area2);
    }
}
