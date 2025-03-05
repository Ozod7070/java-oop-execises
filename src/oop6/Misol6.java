package oop6;

import java.util.Scanner;

public class Misol6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter f: ");
        double f = scanner.nextDouble();
        if(a == 0 && b == 0 && d == 0 && c == 0){
            System.out.println("Tenglamani yechimi yoq!");
        }else {
            LinearEqaution linearEqaution = new LinearEqaution(a, b, c, d, e, f);
            boolean resultat = linearEqaution.isSolvable();
            double x = linearEqaution.getX();
            double y = linearEqaution.getY();
            System.out.println("Natija: " + resultat);
            System.out.println("y teng: " + x);
            System.out.println("y teng: " + y);
        }

    }
}
