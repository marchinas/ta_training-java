package com.epam.training.student_evgeniy_marchenko.module3.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int restaurantBill = scanner.nextInt();
        int numberOfPersons = scanner.nextInt();

        if (restaurantBill < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (numberOfPersons <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            double tips = restaurantBill + (restaurantBill * 0.10);
            System.out.println((int)Math.round(tips) / numberOfPersons);
        }
    }
}


