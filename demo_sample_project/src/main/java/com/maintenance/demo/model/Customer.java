package com.maintenance.demo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Thực thể Khách hàng trong hệ thống.
 * Quan hệ 1-N với Order (Một khách hàng có nhiều đơn hàng).
 */
public class Customer extends BaseEntity {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;

    private List<Order> orders = new ArrayList<>();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
