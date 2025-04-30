package oop.productoCRUD;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    // repositorio
    private static ProductoRepository repository = new ProductoRepository();
    // scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        mostrarTodosLosProductos();
                        break;
                    case 2:
                        filtrarProductoPorId();
                        break;
                    case 3:
                        guardarNuevoProducto();
                        break;
                    case 4:
                        actualizarProducto();
                        break;
                    case 5:
                        eliminarProductoPorId();
                        break;
                    case 6:
                        eliminarTodosLosProductos();
                        break;
                    case 7:
                        System.out.println("¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }

            // excepción - scanner no puede interpretar la entrada como un número entero
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine(); // limpiar el buffer del scanner
                opcion = 0;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }

            // pausa para que el usuario pueda leer el resultado antes de volver al menú
            if (opcion != 7) {
                System.out.println("\nPulse Enter para continuar...");
                scanner.nextLine();
            }

        } while (opcion != 7);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("1. Mostrar todos los productos.");
        System.out.println("2. Filtrar producto por ID.");
        System.out.println("3. Guardar un nuevo producto.");
        System.out.println("4. Actualizar un producto por ID.");
        System.out.println("5. Eliminar un producto por ID.");
        System.out.println("6. Eliminar todos los productos.");
        System.out.println("7. Salir");
        System.out.println("Seleccione una opción: ");
    }

    private static void mostrarTodosLosProductos() {
        List<Producto> productos = repository.findAll();

        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("LISTA DE PRODUCTOS:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
            System.out.println("Total de productos: " + productos.size());
        }
    }

    private static void filtrarProductoPorId() {
        System.out.println("Ingrese el ID del producto: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        Producto producto = repository.findById(id);
        if (producto != null) {
            System.out.println("Producto encontrado:");
            System.out.println(producto);
        } else {
            System.out.println("No se encontró ningún producto con el ID: " + id);
        }
    }

    private static void guardarNuevoProducto() {
        System.out.println("Ingrese el ID del producto: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("¿El producto está disponible? (s/n)");
        boolean disponible = scanner.nextLine().toLowerCase().startsWith("s");

        Producto nuevoProducto = new Producto(id, nombre, precio, disponible);
        repository.save(nuevoProducto);
        System.out.println("Producto guardado correctamente: " + nuevoProducto);
    }

    private static void actualizarProducto() {
        System.out.print("Ingrese el ID del producto a actualizar: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        Producto productoExistente = repository.findById(id);
        if (productoExistente == null) {
            System.out.println("No se encontró ningún producto con el ID: " + id);
            return;
        }

        System.out.println("Producto actual: " + productoExistente);

        System.out.print("Ingrese el nuevo nombre (deje en blanco para mantener '" +
                productoExistente.getNombre() + "'): ");
        String nombre = scanner.nextLine();
        if (nombre.isEmpty()) {
            nombre = productoExistente.getNombre();
        }

        System.out.print("Ingrese el nuevo precio (actual: " + productoExistente.getPrecio() + "): ");
        String precioStr = scanner.nextLine();
        double precio = precioStr.isEmpty() ? productoExistente.getPrecio() :
                Double.parseDouble(precioStr);

        System.out.print("¿El producto está disponible? (s/n) (actual: " +
                (productoExistente.isDisponible() ? "Sí" : "No") + "): ");
        String dispStr = scanner.nextLine();
        boolean disponible = dispStr.isEmpty() ? productoExistente.isDisponible() :
                dispStr.toLowerCase().startsWith("s");

        Producto productoActualizado = new Producto(null, nombre, precio, disponible);
        boolean actualizado = repository.update(id, productoActualizado);

        if (actualizado) {
            System.out.println("Producto actualizado correctamente: " + repository.findById(id));
        } else {
            System.out.println("No se pudo actualizar el producto");
        }
    }

    private static void eliminarProductoPorId() {
        System.out.print("Ingrese el ID del producto a eliminar: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea

        boolean eliminado = repository.deleteById(id);
        if (eliminado) {
            System.out.println("Producto eliminado correctamente");
        } else {
            System.out.println("No se encontró ningún producto con el ID: " + id);
        }
    }

    private static void eliminarTodosLosProductos() {
        System.out.print("¿Está seguro de que desea eliminar TODOS los productos? (s/n): ");
        String confirmacion = scanner.nextLine();

        if (confirmacion.toLowerCase().startsWith("s")) {
            repository.deleteAll();
            System.out.println("Todos los productos han sido eliminados");
        } else {
            System.out.println("Operación cancelada");
        }
    }
}
