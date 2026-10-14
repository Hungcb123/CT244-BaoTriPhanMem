package com.maintenance.demo.controller;

import com.maintenance.demo.model.Customer;
import com.maintenance.demo.service.CustomerService;
import java.util.List;

/**
 * Tầng Controller REST API tiếp nhận yêu cầu về Khách hàng.
 */
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public Customer getCustomerById(Long id) {
        return customerService.getCustomerById(id);
    }

    public Customer createCustomer(Customer customer) {
        return customerService.registerCustomer(customer);
    }
}
