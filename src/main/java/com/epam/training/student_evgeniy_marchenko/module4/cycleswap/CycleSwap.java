package com.epam.training.student_evgeniy_marchenko.module4.cycleswap;

import java.util.Arrays;

class CycleSwap {

    static void cycleSwap(int[] array) {
        if (array.length == 0) {
            System.out.println(Arrays.toString(array));
        } else {
            int[] copyOfArray = new int[array.length];
            System.arraycopy(array, 0, copyOfArray, 0, array.length);
            System.arraycopy(copyOfArray, 0, array, 1, array.length - 1);
            array[0] = copyOfArray[copyOfArray.length - 1];
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length == 0) {
            System.out.println(Arrays.toString(array));
        } else {
            int[] copyOfArray = new int[array.length];
            System.arraycopy(array, 0, copyOfArray, 0, array.length);
            System.arraycopy(copyOfArray, 0, array, shift, array.length - shift);
            System.arraycopy(copyOfArray, array.length - shift, array, 0, shift);
        }
    }

}
