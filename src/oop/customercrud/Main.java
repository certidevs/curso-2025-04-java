package oop.customercrud;

import java.util.Scanner;

/*
Ejercicio: CRUD en Java de modelo Customer sobre un ArrayList

https://app.certidevs.com/project-exam/8c310bb4-a913-4b8f-bfd7-8b6e0f237191
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerRepository customerRepository = new CustomerRepository();

        System.out.println("Te damos la bienvenida a Agenda de clientes. Elige una opción:");
        while (true) {
            System.out.println("""
                    1 - Mostrar todos los clientes.
                    2 - Filtrar cliente por ID.
                    3 - Guardar un nuevo cliente.
                    4 - Actualizar un cliente por ID.
                    5 - Eliminar un cliente por ID.
                    6 - Eliminar todos los clientes.
                    7 - Salir
                    """);
            int opcion = scanner.nextInt();

            System.out.println("Has elegido la opción: " + opcion);

            if (opcion == 1) {
                System.out.println(customerRepository.findAll());

            } else if (opcion == 2) {

                System.out.println("Introduce ID de cliente que quieres encontrar: ");
                Long id = scanner.nextLong();
                Customer customer = customerRepository.findById(id);
                if (customer != null) {
                    System.out.println(customer);
                } else {
                    System.out.println("No existe el cliente con el ID: " + id);
                }

            } else if (opcion == 3) {

                System.out.println("Introduce ID de cliente que quieres crear:");
                Long id = scanner.nextLong();

                System.out.println("Introduce nombre de cliente: ");
                String nombre = scanner.nextLine();

                System.out.println("Introduce apellido de cliente: ");
                String apellido = scanner.nextLine();

                System.out.println("Introduce email de cliente: ");
                String email = scanner.next();

                System.out.println("Introduce edad de cliente:");
                Integer edad = scanner.nextInt();

                // Crear objeto Customer con los datos leídos:
                Customer customer = new Customer(id, nombre, apellido, email, edad);

                customerRepository.save(customer);

            } else if (opcion == 4) {
                System.out.println("Introduce el ID del cliente que quieres actualizar: ");
                Long id = scanner.nextLong();

                // verificar si el cliente existe
                Customer existingCustomer = customerRepository.findById(id);
                if (existingCustomer == null) {
                    System.out.println("No existe el cliente con el ID: " + id);
                    continue;
                }

                System.out.println("Introduce nuevo nombre de cliente: ");
                String nombre = scanner.nextLine();

                System.out.println("Introduce nuevo apellido de cliente: ");
                String apellido = scanner.nextLine();

                System.out.println("Introduce nuevo email de cliente: ");
                String email = scanner.next();

                System.out.println("Introduce nueva edad de cliente: ");
                Integer edad = scanner.nextInt();

                // crear objeto Customer con los datos leídos
                Customer updatedCustomer = new Customer(id, nombre, apellido, email, edad);
                boolean updated = customerRepository.update(id, updatedCustomer);

                if (updated) {
                    System.out.println("Cliente actualizado con éxito.");
                } else {
                    System.out.println("No se ha podido actualizar el cliente.");
                }
            } else if (opcion == 5) {
                System.out.println("Introduce el ID del cliente que quieres eliminar: ");
                Long id = scanner.nextLong();

                boolean deleted = customerRepository.delete(id);

                if (deleted) {
                    System.out.println("Cliente eliminado correctamente.");
                } else {
                    System.out.println("No existe el cliente con el ID: " + id);
                }
            } else if (opcion == 6) {
                System.out.println("¿Estás seguro de que deseas eliminar todos los clientes? (s/n)");
                String confirmacion = scanner.next();

                if (confirmacion.equalsIgnoreCase("s")) {
                    customerRepository.deleteAll();
                    System.out.println("Se han eliminado todos los clientes.");
                } else {
                    System.out.println("Operación cancelada.");
                }
            } else if (opcion == 7) {
                System.out.println("Hasta luego.");
                break;
            }
        }
    }
}

// Ejemplo más sofisticado para leer datos y gestionar errores y validar los datos para saber que están bien
/*

  while (true) {
    try {
        System.out.println("Introduce nombre de cliente: ");
        String nombre = scanner.next();
        if (nombre.length() >= 2 && nombre.length() <= 50) {
            System.out.println("Nombre correcto: " + nombre);
            break;
        } else {
            System.out.println("Longitud no correcta, nombre debe tener entre 3 y 50 caracteres");
        }
    } catch (Exception e) {
        System.out.println("El nombre no es correcto");
    }
}

 */