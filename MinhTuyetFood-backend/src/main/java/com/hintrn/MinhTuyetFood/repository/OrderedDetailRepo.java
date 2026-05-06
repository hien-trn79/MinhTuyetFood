package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.OrderDetailKey;
import com.hintrn.MinhTuyetFood.model.OrderedDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderedDetailRepo extends JpaRepository<OrderedDetail, Integer> {
    @Query("SELECT od FROM OrderedDetail od WHERE od.id.foodId = :foodId AND od.id.orderId = :orderId AND od.id.typeFoodId = :typeFoodId")
    OrderedDetail findBySuperPrimary(int foodId, int orderId, int typeFoodId);
}
