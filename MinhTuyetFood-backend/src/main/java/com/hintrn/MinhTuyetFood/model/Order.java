package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table (name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private Integer orderTable;
    private String orderNote;
    private Date orderTime;

    @ManyToOne
    @JoinColumn(name = "accountEmail")
    private Account account;

    public Order() {
        this.orderId = -1;
        this.orderTable = 0;
        this.orderNote = "";
        this.orderTime = new Date();
        this.account = new Account();
    }

    public Order(int orderId, int orderTable, String orderNote, Date orderTime, Account account) {
        this.orderId = orderId;
        this.orderTable = orderTable;
        this.orderNote = orderNote;
        this.orderTime = orderTime;
        this.account = account;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderTable=" + orderTable +
                ", orderNote='" + orderNote + '\'' +
                ", orderTime=" + orderTime +
                ", account=" + account +
                '}';
    }
}
