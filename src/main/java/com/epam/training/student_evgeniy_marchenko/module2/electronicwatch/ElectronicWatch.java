package com.epam.training.student_evgeniy_marchenko.module2.electronicwatch;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int h = seconds/3600;
        int mm = (seconds % 3600) / 60;
        int ss = (seconds % 3600) % 60;

        System.out.printf("%01d:%02d:%02d%n", ((h >= 24) ? h % 24 : h), mm, ss);
    }
}
