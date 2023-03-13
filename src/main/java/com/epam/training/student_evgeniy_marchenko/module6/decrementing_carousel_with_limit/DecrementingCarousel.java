package com.epam.training.student_evgeniy_marchenko.module6.decrementing_carousel_with_limit;

public class DecrementingCarousel {
    private final int capacity;
    static int[] carousel;
    int index = 0;
    boolean isRun = false;
    int actionLimit;

    public DecrementingCarousel(int capacity, int actionLimit) {
        this.capacity = capacity;
        carousel = new int[capacity];
        this.actionLimit = actionLimit;
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
