package Zadanie1;

import java.util.LinkedList;
public class RemoveFirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Wypełnienie listy wybranymi wartościami
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Oryginalna lista: " + list);

        // Usunięcie pierwszego i ostatniego elementu
        String firstElement = list.removeFirst();
        String lastElement = list.removeLast();

        System.out.println("Usunięte elementy: " + firstElement + ", " + lastElement);
        System.out.println("Lista po usunięciu elementów: " + list);
    }
}