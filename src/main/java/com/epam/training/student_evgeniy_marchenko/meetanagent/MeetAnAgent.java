package com.epam.training.student_evgeniy_marchenko.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //put you code here
        Scanner inputValue = new Scanner(System.in);
        int currentValue = inputValue.nextInt();

        if (currentValue == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
