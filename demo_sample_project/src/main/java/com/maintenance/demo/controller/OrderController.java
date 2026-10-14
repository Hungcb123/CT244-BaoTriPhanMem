package com.maintenance.demo.controller;

import com.maintenance.demo.model.Order;
import com.maintenance.demo.model.OrderItem;
import com.maintenance.demo.service.OrderService;
import java.util.List;

/**
 * Tầng Controller REST API tiếp nhận yêu cầu về Đơn hàng.
 */
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order submitOrder(Long customerId, List<OrderItem> items, String paymentMethod) {
        return orderService.createOrder(customerId, items, paymentMethod);
    }
}
