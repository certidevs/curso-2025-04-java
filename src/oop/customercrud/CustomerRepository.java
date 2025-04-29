package oop.customercrud;

import java.util.*;

/**
 * Actúa como una base de datos de clientes
 * CRUD
 * Create, Read, Update, Delete
 */
public class CustomerRepository {

    private List<Customer> customers = new ArrayList<>();

    // Devuelve la lista de clientes para poder saber qué clientes hay
    public List<Customer> findAll() {
        return customers;
        //return Collections.unmodifiableList(customers);
    }
    // Devuelve un cliente por su id
    public Customer findById(Long id) {
        for (Customer customer: customers){
            if (customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
        // throw new NoSuchElementException("Customer not found");
        // return Optional.empty();
    }


    //save(Customer customer)
    //findById(Long id)
    //update(Long id, Customer updatedCustomer)
    //delete(Long id)
    //findAll()

}
