package com.epam.training.student_evgeniy_marchenko.module6.gradually_decreasing_carousel;

public class GraduallyDecreasingCarouselRun extends CarouselRun {
    int decrement = 1;

    @Override
    public int next() {
        int beforeDecreasing;
        if (isFinished())
            return -1;
        else {
            beforeDecreasing = array[position];
            array[position] -= decrement;
            do {
                position++;
                if (position == array.length) {
                    decrement++;
                    position = 0;
                }
            } while ((array[position] <= 0) && !isFinished());
        }
        return beforeDecreasing;
    }
}
