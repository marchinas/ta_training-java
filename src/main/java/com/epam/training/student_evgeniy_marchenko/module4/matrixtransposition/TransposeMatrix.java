package com.epam.training.student_evgeniy_marchenko.module4.matrixtransposition;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
        int[][] newMatrix = new int [column][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }


    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
