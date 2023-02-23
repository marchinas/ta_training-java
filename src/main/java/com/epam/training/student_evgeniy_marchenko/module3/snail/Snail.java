package com.epam.training.student_evgeniy_marchenko.module3.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        for (int i = 0, days = 0; ; ) {
            days++;
            i += a;
            if (i >= h) {
                System.out.println(days);
                break;
            } else if ((a - b) <= 0 && (a - b) * 2 < h) {
                System.out.println("Impossible");
                break;
            } else {
                i -= b;
            }
        }

    }
}
