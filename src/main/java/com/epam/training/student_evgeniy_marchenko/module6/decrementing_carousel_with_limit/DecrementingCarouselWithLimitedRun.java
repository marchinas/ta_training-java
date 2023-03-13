package com.epam.training.student_evgeniy_marchenko.module6.decrementing_carousel_with_limit;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel {
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity, actionLimit);
    }

    @Override
    public CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun(actionLimit);
        }
        return null;
    }
}
