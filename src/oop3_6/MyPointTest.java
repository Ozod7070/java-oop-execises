package oop3_6;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);
        System.out.println(p1.dictance(p2));
        System.out.println(p2.dictance(p1));
        System.out.println(p1.dictance(5, 6));
        System.out.println(p1.dictance());
    }
}
