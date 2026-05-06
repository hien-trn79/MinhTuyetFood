package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.model.Account;
import com.hintrn.MinhTuyetFood.model.Order;
import com.hintrn.MinhTuyetFood.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService service;

    // [GET] /orders
    @GetMapping
    public List<Order> getOrders() {
        return service.getOrders();
    }

    // [GET] /orders/{orderId}
    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable int orderId) {
        return service.getOrderById(orderId);
    }

    // [POST] /orders
    @PostMapping
    public void addOrder(@RequestBody Order newOrder) {
        service.addOrder(newOrder);
    }

    // [PUT] /orders/:id
    @PutMapping
    public void updateOrder(@RequestBody Order newOrder) {
        service.updateOrder(newOrder);
    }

    // [DELETE] /orders/{orderId}
    @DeleteMapping("/{orderId}")
    public void deleteOrderById(@PathVariable int orderId) {
        service.deleteOrder(orderId);
    }
}
