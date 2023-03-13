package com.epam.training.student_evgeniy_marchenko.module6.halving_carousel;

public class HalvingCarouselRun extends CarouselRun {
    public int decrement = 2;

    @Override
    public int next() {
        int beforeDecreasing;
        if (isFinished())
            return -1;
        else {
            beforeDecreasing = array[position];
            array[position] = array[position] / decrement;
            do {
                position++;
                if (position == array.length) {
                    position = 0;
                }
            } while(array[position %= array.length] <= 0 && !isFinished());
        }
        return beforeDecreasing;
    }
}
