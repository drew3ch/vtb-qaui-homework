package ru.geekbrains.qaui.lesson04.homework;

public class squareTriangle {

    public double squareTriangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (b + c > a) && (c + a > b)) {
                double p = (a + b + c) / 2;
                return Math.sqrt(p * (p - a) * (p - b) * (p - c));
            } else return 0;
        } else return 0;
    }

    public boolean isTriangle(double a, double b, double c) {
        return ((a + b > c) && (b + c > a) && (c + a > b));
    }

    public boolean isIsoscelesTriangle(double a, double b, double c) {
        return ((a == b) || (b == c) || (c == a));
    }

    public boolean isEquilateralTriangle(double a, double b, double c) {
        return ((a == b) && (b == c));
    }

}