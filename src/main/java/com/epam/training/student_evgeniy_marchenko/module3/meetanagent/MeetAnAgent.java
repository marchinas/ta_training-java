package com.epam.training.student_evgeniy_marchenko.module3.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976;

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        int currentValue = inputValue.nextInt();

        if (currentValue == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}