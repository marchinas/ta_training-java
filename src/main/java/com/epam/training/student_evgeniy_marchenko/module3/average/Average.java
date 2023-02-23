package com.epam.training.student_evgeniy_marchenko.module3.average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int additionResult = 0;
        int numberOfIterations = 0;

        for (; ;) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else {
                additionResult += i;
                numberOfIterations++;
            }
        }

        System.out.println(additionResult / numberOfIterations);
    }

}