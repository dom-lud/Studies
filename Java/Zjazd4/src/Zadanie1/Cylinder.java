package Zadanie1;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 4.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}