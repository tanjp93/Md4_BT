import rikkei.academy.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap b:");
        double b = scanner.nextDouble();
        System.out.println("Nhap c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double r = quadraticEquation.getRoot();
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();
        if (delta > 0) {
            System.out.println("phương trình có hai nghiệm " + r1 + " và " + r2);
        } else if (delta == 0) {
            System.out.println("phương trình có nghiệm kép " + r);
        } else{
            System.out.println("pt vô nghiệm");
        }
    }
}
