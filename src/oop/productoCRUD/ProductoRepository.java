package oop.productoCRUD;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepository {
    private ArrayList<Producto> productos;

    // constructor que inicializa la lista de productos
    public ProductoRepository() {
        this.productos = new ArrayList<>();

        // añadir productos iniciales
        Producto producto1 = new Producto(1L, "Manzana", 1.20, true);
        this.productos.add(producto1);
        this.productos.add(new Producto(2L, "Yogur", 2.25, true));
        this.productos.add(new Producto(3L, "Avena", 3.0, false));
    }

    public List<Producto> findAll() {
        return new ArrayList<>(productos);
    }

    public Producto findById(Long id) {
        // recorrer la lista y devolver el producto SI encontramos coincidencia de ID
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        // si no encontramos el producto, devolvemos null
        return null;
    }

    public Producto save(Producto producto) {
        // verificar si ya existe un producto con ese ID
        if (findById(producto.getId()) != null) {
            throw new IllegalArgumentException("Ya existe un producto con el ID: " + producto.getId());
        }
        // si no existe, lo añadimos a la lista
        productos.add(producto);
        return producto;
    }

    public boolean update(Long id, Producto producto) {
        // bucle que recorre la lista de productos
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId().equals(id)) {
                // asignar el ID al producto que vamos a actualizar
                producto.setId(id);
                // reemplazar el producto en ese índice
                productos.set(i, producto);
                return true; // actualización exitosa
            }
        }
        // si no encontramos el producto, retornamos false
        return false;
    }

    public boolean deleteById(Long id) {
        // se usa removeIf para eliminar el producto que coincida con el ID
        return productos.removeIf(producto -> producto.getId().equals(id));
    }

    public void deleteAll() {
        // limpiar la lista completa
        productos.clear();
    }
}
