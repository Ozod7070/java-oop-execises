package oop6;

public class LinearEqaution {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;

    LinearEqaution(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    boolean isSolvable(){
        if((a * d) != (b * c)){
            return  true;
        }
        return false;
    }

    double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }

    double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }
}
