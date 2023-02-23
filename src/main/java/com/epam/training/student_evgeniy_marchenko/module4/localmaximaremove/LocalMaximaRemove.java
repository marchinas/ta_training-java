package com.epam.training.student_evgeniy_marchenko.module4.localmaximaremove;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        try {

            throw new UnsupportedOperationException();

        } catch (Exception e) {

            int localMaxima = 0;
            int[] copy = new int[array.length];
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    if (array[i] > array[i + 1]) {
                        localMaxima++;
                    } else {
                        copy[index++] = array[i];
                    }
                } else if (i < (array.length- 1)) {
                    if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                        localMaxima++;
                    } else {
                        copy[index++] = array[i];
                    }
                } else if (i == array.length - 1) {
                    if (array[i] > array[i - 1]) {
                        localMaxima++;
                    } else {
                        copy[index++] = array[i];
                    }
                }
            }
            int[] returnCopy = new int[copy.length - localMaxima];
            System.arraycopy(copy, 0, returnCopy, 0, copy.length - localMaxima);
            return returnCopy;
        }
    }
}
