package Zadanie2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0);
        System.out.println(point); // MovablePoint{x=0, y=0}

        point.moveUp();
        System.out.println(point); // MovablePoint{x=0, y=1}

        point.moveDown();
        System.out.println(point); // MovablePoint{x=0, y=0}

        point.moveLeft();
        System.out.println(point); // MovablePoint{x=-1, y=0}

        point.moveRight();
        System.out.println(point); // MovablePoint{x=0, y=0}
    }
}
