package com.epam.training.student_evgeniy_marchenko.module3.maxvalueinsequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        Scanner scanner = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;

        for (; ;) {
            int i = scanner.nextInt();

            if (i == 0) {
                break;
            } else if (i > maxValue) {
                maxValue = i;
            }
        }

        return maxValue;

    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        System.out.println(max());
    }
}
