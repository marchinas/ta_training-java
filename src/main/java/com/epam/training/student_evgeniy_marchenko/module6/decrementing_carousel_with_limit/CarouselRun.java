package com.epam.training.student_evgeniy_marchenko.module6.decrementing_carousel_with_limit;


public class CarouselRun {
    protected final int[] array = DecrementingCarousel.carousel.clone();
    protected int position = 0;
    protected int limitOfActions;
    protected boolean isLimited;

    public CarouselRun() {
        this.isLimited = false;
    }

    public CarouselRun(int limitOfActions) {
        this.limitOfActions = limitOfActions;
        this.isLimited = true;
    }

    public int next() {

        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }

        limitOfActions--;

        return array[position++]--;
    }

    public boolean isFinished() {
        if (isLimited && limitOfActions <= 0) {
            return true;
        }

        for (int el : array) {
            if (el > 0) {
                return false;
            }
        }
        return true;
    }
}
