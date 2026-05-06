package com.hintrn.MinhTuyetFood.service;

import com.hintrn.MinhTuyetFood.model.Account;
import com.hintrn.MinhTuyetFood.model.Order;
import com.hintrn.MinhTuyetFood.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo repo;

    // [GET] /orders
    public List<Order> getOrders() {
        return repo.findAll();
    }

    // [GET /orders/{orderId}
    public Order getOrderById(int id) {
        return repo.findById(id).orElse(null);
    }

    // [POST] /orders
    public void addOrder(Order newOrder) {
        repo.save(newOrder);
    }

    // [PUT] /orders/{orderId}
    public void updateOrder(Order newOrder) {
        repo.save(newOrder);
    }

    // [DELETE] /orders/{orderId}
    public void deleteOrder(int accountId) {
        repo.deleteById(accountId);
    }
}
