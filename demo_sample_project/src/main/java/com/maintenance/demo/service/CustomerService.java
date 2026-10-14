package com.maintenance.demo.service;

import com.maintenance.demo.model.Customer;
import com.maintenance.demo.repository.CustomerRepository;
import java.util.List;

/**
 * Tầng Service xử lý nghiệp vụ Khách hàng.
 * Phụ thuộc (Injected Dependency) vào CustomerRepository.
 */
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer registerCustomer(Customer customer) {
        if (customerRepository.findByEmail(customer.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already exists: " + customer.getEmail());
        }
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
