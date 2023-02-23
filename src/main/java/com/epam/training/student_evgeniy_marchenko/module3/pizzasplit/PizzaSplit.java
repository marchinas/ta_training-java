package com.epam.training.student_evgeniy_marchenko.module3.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = scanner.nextInt();
        int numberOfPizzaSlices = scanner.nextInt();
        int numberOfPizzas = 0;

        for (; ;) {
            numberOfPizzas++;
            int result = (numberOfPizzaSlices * numberOfPizzas) % numberOfPerson;
            if (result == 0) {
                System.out.println(numberOfPizzas);
                break;
            }
        }

    }
}
