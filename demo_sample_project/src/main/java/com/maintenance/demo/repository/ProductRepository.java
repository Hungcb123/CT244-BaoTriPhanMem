package com.maintenance.demo.repository;

import com.maintenance.demo.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(Long id);
    Optional<Product> findByProductCode(String code);
    List<Product> findAll();
    Product save(Product product);
    void deleteById(Long id);
}
