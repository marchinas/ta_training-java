package com.epam.training.student_evgeniy_marchenko.module5.decrementingcarousel;

public class Main {
    public static void main(String[] args) {
        CarouselRun run = new DecrementingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
    }
}
