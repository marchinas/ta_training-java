package com.epam.training.student_evgeniy_marchenko.module5.triangle;

class Triangle {

    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        //TODO
        double lab, lac, lbc;
        lab = length(a, b);
        lac = length(a, c);
        lbc = length(b, c);

        if ((lab + lac) <= lbc || (lab + lbc) <= lac || (lbc + lac) <= lab) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static double length (Point a, Point b)
    {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double area() {
        //TODO
        return Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY())) /2;

    }

    public Point centroid(){
        //TODO

        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;

        return new Point(x, y);

    }

}
