package oop.customercrud;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerRepository customerRepository = new CustomerRepository();

        System.out.println("Te damos la bienvenida a Agenda de clientes. Elige una opción:");
        while (true) {
            System.out.println("""
                    1 - Mostrar todos los clientes.
                    2 - Filtrar cliente por ID.
                    ...
                    5 - Salir
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


            } else if (opcion == 5) {
                System.out.println("Hasta luego.");
                break;
            }
        }
    }
}
