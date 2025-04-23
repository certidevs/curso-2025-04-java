import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    public static void main(String[] args) {

        // crear categorías
        Categoria lacteos = new Categoria(1, "Lácteos");
        Categoria frutas = new Categoria(2, "Frutas");

        // crear productos
        Producto leche = new Producto(1, "Leche", 1.50, 20, 1);
        Producto queso = new Producto(2, "Queso", 5.50, 10, 1);
        Producto manzana = new Producto(3, "Manzana", 0.50, 30, 2);

        // añadir los productos a las categorías
        lacteos.addProducto(leche);
        lacteos.addProducto(queso);
        frutas.addProducto(manzana);

        // mostrar los productos de la categoría lácteos
        System.out.println("Productos en " + lacteos.getNombre() + ":");
        for(Producto p : lacteos.getProductos()) {
            System.out.println("- " + p.getNombre() + ": " + p.getPrecio() + "€");
        }
    }
}

class Categoria {
    private int id;
    private String nombre;
    private List<Producto> productos;

    // constructor
    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.productos = new ArrayList<>(); // inicializa una lista vacía
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    // método para agregar un producto a Categoria
    public void addProducto(Producto producto) {
        // comprueba si el producto NO está ya en la lista
        if (!productos.contains(producto)) {
            productos.add(producto);
        }
    }

}

class Producto {
    private int id; // identificador único
    private  String nombre; // nombre
    private double precio; // precio unitario
    private int stock; // cantidad disponible
    private int categoriaId; // el ID de la categoría (no la referencia al objeto)
    // private Categoria categoria; // relación bidireccional

    // constructor
    public Producto(int id, String nombre, double precio, int stock, int categoriaId) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoriaId = categoriaId;
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    // toString
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", categoriaId=" + categoriaId +
                '}';
    }
}