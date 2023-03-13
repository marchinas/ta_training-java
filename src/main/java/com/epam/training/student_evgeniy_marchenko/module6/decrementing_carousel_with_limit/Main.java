package com.epam.training.student_evgeniy_marchenko.module6.decrementing_carousel_with_limit;

public class Main {
    public static void main(String[] args) {
        // empty case

        CarouselRun run = new DecrementingCarouselWithLimitedRun(7, 5).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        // regular case

        DecrementingCarousel carousel = new DecrementingCarouselWithLimitedRun(7, 10);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run1 = carousel.run();

        System.out.println(run1.isFinished()); //false

        System.out.println(run1.next()); //20
        System.out.println(run1.next()); //30
        System.out.println(run1.next()); //10

        System.out.println(run1.next()); //19
        System.out.println(run1.next()); //29
        System.out.println(run1.next()); //9

        System.out.println(run1.next()); //18
        System.out.println(run1.next()); //28
        System.out.println(run1.next()); //8

        System.out.println(run1.next()); //17

        System.out.println(run1.isFinished()); //true
        System.out.println(run1.next()); //-1
    }
}
