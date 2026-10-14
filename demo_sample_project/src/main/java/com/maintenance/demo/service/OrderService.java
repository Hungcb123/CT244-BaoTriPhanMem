package com.maintenance.demo.service;

import com.maintenance.demo.model.Customer;
import com.maintenance.demo.model.Order;
import com.maintenance.demo.model.OrderItem;
import com.maintenance.demo.model.Product;
import com.maintenance.demo.repository.CustomerRepository;
import com.maintenance.demo.repository.OrderRepository;
import com.maintenance.demo.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Tầng Service điều phối nghiệp vụ Đặt hàng và tính toán tài chính.
 * Minh họa mối quan hệ phụ thuộc nhiều Repository trong phân tích kiến trúc bảo trì.
 */
public class OrderService {
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository,
                        CustomerRepository customerRepository,
                        ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    public Order createOrder(Long customerId, List<OrderItem> items, String paymentMethod) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found"));

        Order order = new Order();
        order.setOrderNumber("ORD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase());
        order.setCustomer(customer);
        order.setStatus("PENDING");
        order.setPaymentMethod(paymentMethod);

        BigDecimal total = BigDecimal.ZERO;
        for (OrderItem item : items) {
            Product product = productRepository.findById(item.getProduct().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Product not found"));

            if (product.getStockQuantity() < item.getQuantity()) {
                throw new IllegalStateException("Insufficient stock for product: " + product.getName());
            }

            // Trừ tồn kho và tính tiền
            product.setStockQuantity(product.getStockQuantity() - item.getQuantity());
            productRepository.save(product);

            item.setOrder(order);
            item.setUnitPrice(product.getPrice());
            item.setSubTotal(product.getPrice().multiply(BigDecimal.valueOf(item.getQuantity())));
            total = total.add(item.getSubTotal());
            order.getItems().add(item);
        }

        order.setTotalAmount(total);
        return orderRepository.save(order);
    }
}
