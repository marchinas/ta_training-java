package com.epam.training.student_evgeniy_marchenko.module3.meetstrangers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int meetings = input.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        if (meetings > 0) {
            for (int i = 0; i < meetings; i++) {
                String name = reader.readLine();
                System.out.println("Hello, " + name);
            }
        } else if (meetings == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
         input.close();
    }
}
