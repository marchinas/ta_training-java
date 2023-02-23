package com.epam.training.student_evgeniy_marchenko.module4.sumofevennumbers;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        try {
            throw new UnsupportedOperationException();
        } catch (Exception e) {
            int i = 0;
            if (array == null || array.length == 0) {
                return 0;
            } else {
                for (int element : array) {
                    if ((element % 2) == 0) {
                        i += element;
                    }
                }
            }
            return i;
        }
    }
}
