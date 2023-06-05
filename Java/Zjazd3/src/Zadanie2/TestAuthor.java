package Zadanie2;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Dominik","Ludwinski", 19);
        Author a2 = new Author("Ala", "Ptak", 28);

        System.out.println(a1.toString());
        a1.setSurname("Prus");
        System.out.println("Author name = "+a1.getName()+" surname = "+a1.getSurname()+", age = "+a1.getAge());
        System.out.println(a2.toString());
        System.out.println("Name: "+a2.getName()+" age: "+a2.getAge());
    }
}
