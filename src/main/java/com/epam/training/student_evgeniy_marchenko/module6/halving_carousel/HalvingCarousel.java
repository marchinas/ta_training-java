package com.epam.training.student_evgeniy_marchenko.module6.halving_carousel;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }
    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new HalvingCarouselRun();
        }
        return null;
    }
}
