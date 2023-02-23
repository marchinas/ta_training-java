package com.epam.training.student_evgeniy_marchenko.module4.spiral;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];

        int integers = 1;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        for(; ;) {

            if (left > right) {
                break;
            } else {
                for (int i = left; i <= right; i++) {array[top][i] = integers++;}
                top++;
            }

            if (top > bottom) {
                break;
            } else {
                for (int i = top; i <= bottom; i++) {array[i][right] = integers++;}
                right--;
            }

            if (left > right) {
                break;
            } else {
                for (int i = right; i >= left; i--) {array[bottom][i] = integers++;}
                bottom--;
            }

            if (top > bottom) {
                break;
            } else {
                for (int i = bottom; i >= top; i--) {array[i][left] = integers++;}
                left++;
            }
        }
        return array;
    }
}
