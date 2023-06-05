package Zadanie1;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(4.5);
        Circle c3 = new Circle(1.25, "white");
        Circle c4 = new Circle();
        c4.setColor("red");
        c4.setRadius(3.125);
        System.out.println("The circle c1 has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " and color of " + c1.getColor() + "\n" + c1.toString());
        System.out.println("The circle c2 has radius of " + c2.getRadius() + " and area of " + c2.getArea() + " and color of " + c2.getColor() + "\n" + c2.toString());
        System.out.println("The circle c3 has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and color of " + c3.getColor() + "\n" + c3.toString());
        System.out.println("The circle c4 has radius of " + c4.getRadius() + " and area of " + c4.getArea() + " and color of " + c4.getColor() + "\n" + c4.toString());
    }
}