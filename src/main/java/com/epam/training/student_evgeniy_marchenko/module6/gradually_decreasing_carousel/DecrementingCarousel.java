package com.epam.training.student_evgeniy_marchenko.module6.gradually_decreasing_carousel;

public class DecrementingCarousel {
    private final int capacity;
    static int[] carousel;
    int index;
    boolean isRun;

    {
        index = 0;
        isRun = false;
    }
    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (element > 0 && index < capacity && !isRun) {
            carousel[index++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }
}
