package com.maintenance.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

/**
 * Thực thể Sản phẩm trong danh mục.
 */
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Column(name = "product_code", unique = true)
    private String productCode;
    private String name;
    @Column(precision = 19, scale = 2)
    private BigDecimal price;
    @Column(name = "stock_quantity")
    private Integer stockQuantity;
    private String description;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
