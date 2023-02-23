package com.epam.training.student_evgeniy_marchenko.module4.matricesmultiplication;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] finallyArray = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    finallyArray[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return finallyArray;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
