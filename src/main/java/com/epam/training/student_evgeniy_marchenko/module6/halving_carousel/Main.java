package com.epam.training.student_evgeniy_marchenko.module6.halving_carousel;

public class Main {
    public static void main(String[] args) {
        //empty case

        CarouselRun run = new HalvingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        // regular case

        DecrementingCarousel carousel = new HalvingCarousel(7);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run1 = carousel.run();

        System.out.println(run1.isFinished()); //false

        System.out.println(run1.next()); //20
        System.out.println(run1.next()); //30
        System.out.println(run1.next()); //10

        System.out.println(run1.next()); //10
        System.out.println(run1.next()); //15
        System.out.println(run1.next()); //5

        System.out.println(run1.next()); //5
        System.out.println(run1.next()); //7
        System.out.println(run1.next()); //2

        System.out.println(run1.next()); //2
        System.out.println(run1.next()); //3
        System.out.println(run1.next()); //1

        System.out.println(run1.next()); //1
        System.out.println(run1.next()); //1

        System.out.println(run1.isFinished()); //true
        System.out.println(run1.next()); //-1

    }
}
