package oop.biblioteca;

import java.time.LocalDate;
import java.util.StringJoiner;

/**
 * Clase que representa un libro de una biblioteca.
 */
public class Libro {

    // atributos
    private Long id;
    private String titulo;
    private Integer numeroPaginas;
    private Double precio;
    private Boolean disponible;
    private LocalDate fechaPublicacion;

    // constructor/es

    public Libro() {}

    public Libro(String titulo, Double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public Libro(Long id, String titulo, Integer numeroPaginas, Double precio, LocalDate fechaPublicacion, Boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
        this.disponible = disponible;
    }

    // getter y setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    // toString


    @Override
    public String toString() {
        return new StringJoiner(", ", Libro.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("titulo='" + titulo + "'")
                .add("numeroPaginas=" + numeroPaginas)
                .add("precio=" + precio)
                .add("disponible=" + disponible)
                .add("fechaPublicacion=" + fechaPublicacion)
                .toString();
    }
}
