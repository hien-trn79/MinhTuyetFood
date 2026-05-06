package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.model.OrderedDetail;
import com.hintrn.MinhTuyetFood.model.User;
import com.hintrn.MinhTuyetFood.service.OrderedDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderDetails")
@CrossOrigin
public class OrderDetailController {

    @Autowired
    OrderedDetailService service;

    // [GET] /api/orderedDetails
    @GetMapping
    public List<OrderedDetail> getOrderDetails() {
        return service.getOrderDetails();
    }

    // [GET] /api/orderDetails?foodId=?orderId=?typeFoodId=
    public OrderedDetail getByParams(
            @RequestParam("foodId") int foodId,
            @RequestParam("orderId") int orderId,
            @RequestParam("typeFoodId") int typeFoodId
            ) {
        return service.findByParams(foodId, orderId, typeFoodId);
    }

    // [POST] /api/orderDetails
    @PostMapping
    public void addOrderDetail(OrderedDetail newOrderDetail) {
        service.addOrderDetail(newOrderDetail);
    }

    // [PUT] /api/orderDetails
    @PutMapping
    public void updateOrderDetail(OrderedDetail newOrderedDetail) {service.updateOrderDetail(newOrderedDetail);}
}
