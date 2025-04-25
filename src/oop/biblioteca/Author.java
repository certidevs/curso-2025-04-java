package oop.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Clase que representa autor o autora de libros.
 */
public class Author {

    private Long id; // 1, 2, 3, 4....
    private String firstName;
    private String lastName;
    // Añadir relación con libro: OneToMany
    private List<Libro> libros = new ArrayList<>();

    // constructor vacío
    public Author() {

    }

    // constructor con parámetros
    public Author(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Author.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .toString();
    }
}
