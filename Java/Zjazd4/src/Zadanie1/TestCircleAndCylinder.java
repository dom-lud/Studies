package Zadanie1;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle 1:");
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Color = " + c1.toString());

        Circle c2 = new Circle(2.0);
        System.out.println("\nCircle 2:");
        System.out.println("Radius = " + c2.getRadius());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Color = " + c2.toString());

        Cylinder cyl1 = new Cylinder();
        System.out.println("\nCylinder 1:");
        System.out.println("Radius = " + cyl1.getRadius());
        System.out.println("Height = " + cyl1.getHeight());
        System.out.println("Volume = " + cyl1.getVolume());

        Cylinder cyl2 = new Cylinder(2.0);
        System.out.println("\nCylinder 2:");
        System.out.println("Radius = " + cyl2.getRadius());
        System.out.println("Height = " + cyl2.getHeight());
        System.out.println("Volume = " + cyl2.getVolume());

        Cylinder cyl3 = new Cylinder(2.0, 5.0);
        System.out.println("\nCylinder 3:");
        System.out.println("Radius = " + cyl3.getRadius());
        System.out.println("Height = " + cyl3.getHeight());
        System.out.println("Volume = " + cyl3.getVolume());
    }
}