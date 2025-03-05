package oop2_1;

public class Circle {
    private double radius;
    private String color;

    Circle(){
        radius = 1;
        color = "red";
    }

    Circle(double r){
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (radius * radius) * Math.PI;
    }
}
