package oop.biblioteca;

import java.time.LocalDate;

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
        quijote.setTitulo("El Quijote de la Mancha");
        quijote.setAuthor(cervantes); // Relación ManyToOne
        System.out.println(quijote);
        System.out.println(quijote.getAuthor().getFirstName() + " " + quijote.getAuthor().getLastName());

        Libro celestina = new Libro("La celestina", 19.99);
        System.out.println(celestina);

        LocalDate diaHoy = LocalDate.now();
        System.out.println(diaHoy);// imprime la fecha de hoy

        LocalDate navidad2024 = LocalDate.of(2024, 12, 20);
        System.out.println(navidad2024);

        // Libro crepusculo = new Libro(1L, "Crepúsculo", 550, 20.0, LocalDate.now(), true);

        Libro crepusculo = new Libro();
        crepusculo.setTitulo("Crepusculo");
        crepusculo.setPrecio(20.0);
        crepusculo.setNumeroPaginas(500);
        crepusculo.setDisponible(true);
        crepusculo.setFechaPublicacion(LocalDate.now());

        System.out.println(quijote);
        System.out.println(celestina);
        System.out.println(crepusculo);




        // 3. RELACIÓN ENTRE LIBRO - AUTHOR
        // A UN AUTOR LE AGREGAMOS 2 LIBROS

        Author david = new Author();
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        david.getLibros().add(libro1);
        david.getLibros().add(libro2);

        libro1.setAuthor(david);
        libro2.setAuthor(david);

        System.out.println(david);





    }

}
