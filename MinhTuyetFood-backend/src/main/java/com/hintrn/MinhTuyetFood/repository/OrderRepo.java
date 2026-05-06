package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
