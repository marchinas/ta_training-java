package com.epam.training.student_evgeniy_marchenko.module5.lineintersection;

public class CustomPoint {
    private final int x;
    private final int y;

    public CustomPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
