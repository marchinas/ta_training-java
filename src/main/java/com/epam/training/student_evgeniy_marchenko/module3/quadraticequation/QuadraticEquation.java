package com.epam.training.student_evgeniy_marchenko.module3.quadraticequation;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = (b * b) - 4 * a * c ;

        if (D > 0) {
            double x1 = (-b + sqrt(D)) / (2 * a);
            double x2 = (-b - sqrt(D)) / (2 * a);
            System.out.printf("%f %f%n", x1, x2);
        } else if (D == 0) {
            double x = (-b) / (2 * a);
            System.out.printf("%f%n", x);
        } else {
            System.out.println("no roots");
        }
    }

}