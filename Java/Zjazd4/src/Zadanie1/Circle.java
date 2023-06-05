package Zadanie1;

public class Circle{
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "blue";
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }
}