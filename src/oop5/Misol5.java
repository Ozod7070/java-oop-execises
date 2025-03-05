package oop5;

import java.util.Scanner;

public class Misol5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double descirminant = quadraticEquation.getDiscirminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();
        System.out.println("Deskirminant: "+ descirminant);
        System.out.println("Root1: "+ root1);
        System.out.println("Root2: "+ root2);
    }
}
