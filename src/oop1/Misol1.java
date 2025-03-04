package oop1;

public class Misol1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        double area1 = rectangle1.getArea();
        double perimetir1  = rectangle1.getPerimetr();
        System.out.println("Area: "+ area1);
        System.out.println("Perimetir: "+perimetir1);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        double area2 = rectangle2.getArea();
        double perimetr2 = rectangle2.getPerimetr();
        System.out.println("Area: "+area2);
        System.out.println("Perimetr: "+perimetr2);

    }
}
