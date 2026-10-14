package com.maintenance.demo.repository;

import com.maintenance.demo.model.Customer;
import java.util.List;
import java.util.Optional;

/**
 * Interface Repository quản lý truy vấn dữ liệu Customer.
 * Minh họa mối quan hệ Realization/Dependency trong kiến trúc Spring Data JPA.
 */
public interface CustomerRepository {
    Optional<Customer> findById(Long id);
    Optional<Customer> findByEmail(String email);
    List<Customer> findAll();
    Customer save(Customer customer);
    void deleteById(Long id);
}
