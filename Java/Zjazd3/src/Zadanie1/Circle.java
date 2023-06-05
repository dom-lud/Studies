package Zadanie1;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        color = "blue";
    }
    public Circle()
    {
        radius = 3.50;
        color = "black";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea(){
        return Math.PI*(radius*radius);
    }
    @Override
    public String toString(){
        return "Circle: radius = " + getRadius() + " color " + getColor();
    }
}