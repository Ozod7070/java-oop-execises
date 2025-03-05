package oop5;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscirminant() {
        return (b * b) - (4 * a * c);
    }

    double getRoot1() {
        if (getDiscirminant() <= 0)
            return 0;
        return (-b + Math.sqrt(getDiscirminant())) / (2 * a);
    }

    double getRoot2() {
        if (getDiscirminant() <= 0)
            return 0;
        return (-b - Math.sqrt(getDiscirminant())) / (2 * a);
    }
}
