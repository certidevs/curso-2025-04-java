package oop.biblioteca;

public class Main {

    public static void main(String[] args) {

        // 1. CREAR OBJETOS AUTHOR:
        Author cervantes = new Author();
        cervantes.setFirstName("Cervantes");
        cervantes.setLastName("Saavedra");
        System.out.println(cervantes);

        var espronceda = new Author();

        Author alan = new Author(1L, "Alan", "Sastre");
        System.out.println(alan);


        // 2. CREAR OBJETOS LIBRO:
        Libro quijote = new Libro();



        // 3. RELACIÓN ENTRE LIBRO - AUTHOR

    }

}
