package rikkei.academy;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c, delta, r1, r2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        double mauso = 2 * a;
        return (-b + Math.sqrt(delta)) / mauso;
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        double mauso1 = 2 * a;
        return (-b - Math.sqrt(delta)) / mauso1;
    }

    public double getRoot() {
        return (-b / 2 * a);
    }
}
