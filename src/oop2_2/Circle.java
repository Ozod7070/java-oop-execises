package oop2_2;

public class Circle {
    private double radius;

    Circle(){
       this.radius = 1;
    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (radius * radius) * Math.PI;
    }

    public double getCircumference(){
        return (radius * Math.PI) * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
