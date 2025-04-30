package oop.productoCRUD;

public class Producto {
    // atributos
    private Long id;
    private String nombre;
    private double precio;
    private boolean disponible;

    // constructor
    public Producto(Long id, String nombre, double precio, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    // getters y setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /*@Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }*/

    @Override
    public String toString() {
        // Formato: - 1. Manzana: 1.20 euros (Disponible)
        StringBuilder sb = new StringBuilder();
        sb.append("- ")
                .append(id)
                .append(". ")
                .append(nombre)
                .append(": ")
                .append(String.format("%.2f", precio))
                .append(" euros ")
                .append("(")
                .append(disponible ? "Disponible" : "No disponible")
                .append(")");
        return sb.toString();
    }
}
