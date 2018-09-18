package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("F1(x) = x - sin x");
        System.out.println("F2(x) = sin^2 x");
        System.out.println("F3(x) = 2cos x - 1");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter h: ");
        double h = scanner.nextDouble();
        double x;
        double F1;
        double F2;
        double F3;
        for (x = a; x < b; x += h); {
            F1 = x - Math.sin(x);
            System.out.println("x = " + x + "F1(x) = " + F1);
            F2 = Math.pow(2, Math.sin(x));
            System.out.println("x = " + x + "F2(x) = " + F2);
            F3 = (2 * Math.cos(x)) - 1;
            System.out.println("x = " + x + "F3(x) = " + F3);
        }
    }
}
