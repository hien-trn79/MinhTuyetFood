package com.hintrn.MinhTuyetFood.service;

import com.hintrn.MinhTuyetFood.model.Food;
import com.hintrn.MinhTuyetFood.model.OrderedDetail;
import com.hintrn.MinhTuyetFood.repository.OrderedDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderedDetailService {

    @Autowired
    OrderedDetailRepo repo;

    // [GET] /orderDetails
    public List<OrderedDetail> getOrderDetails() {
        return repo.findAll();
    }

    // [GET] /api/orderDetails?foodId=?orderId=?typeFoodId=
    public OrderedDetail findByParams(int foodId, int orderId, int typeFoodId) {
        return repo.findBySuperPrimary(foodId, orderId, typeFoodId);
    }

    // [POST] /orderDetails
    public void addOrderDetail(OrderedDetail newOrderDetail) {
        repo.save(newOrderDetail);
    }

    // [PUT] /orderDetails/:foodId
    public void updateOrderDetail(OrderedDetail newOrderDetail) {
        repo.save(newOrderDetail);
    }

    // [DELETE] /orderDetails/:foodId
    public void deleteOrderDetailById(int orderDetailId) {
        repo.deleteById(orderDetailId);
    }
}
