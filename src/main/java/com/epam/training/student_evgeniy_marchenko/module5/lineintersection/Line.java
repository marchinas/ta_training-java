package com.epam.training.student_evgeniy_marchenko.module5.lineintersection;

public class Line {

    int k;
    int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }


    public CustomPoint intersection(Line other) {

            if (this.k == other.k) {
                return null;
            } else {
                int x = (other.b - this.b) / (this.k - other.k);
                int y = this.k * x + this.b;

                return new CustomPoint(x, y);
            }
    }
}
