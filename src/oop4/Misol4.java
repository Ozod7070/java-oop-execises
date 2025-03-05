package oop4;

public class Misol4 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon(6, 4);
        double perimetr1 = regularPolygon1.getPerimetr();
        double area1 = regularPolygon1.getArea();
        System.out.println("Perimetr1: " + perimetr1);
        System.out.println("Area: " + area1 );
        RegularPolygon regularPolygon2 = new RegularPolygon(10,4,5.6,7.8);
        double perimetr2 = regularPolygon2.getPerimetr();
        double area2 = regularPolygon2.getArea();
        System.out.println("Perimetr: " + perimetr2);
        System.out.println("Area: " + area2);
    }
}