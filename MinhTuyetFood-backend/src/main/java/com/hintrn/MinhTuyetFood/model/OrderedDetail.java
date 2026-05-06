package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.hibernate.annotations.EmbeddedTable;

import java.io.Serializable;

@Data
@Entity(name = "OrderedDetail")
public class OrderedDetail implements Serializable {

    @EmbeddedId
    private OrderDetailKey id;

    @ManyToOne
    @MapsId("foodId")
    @JoinColumn(name = "foodId")
    private Food food;

    @ManyToOne
    @MapsId("orderId") // anh xa den thuoc tinh trong OrderDetailKey
    @JoinColumn(name = "orderId")
    private Order order;

    @ManyToOne
    @MapsId("typeFoodId")
    @JoinColumn(name = "typeFoodId")
    private TypeFood typeFood;

    private int quantity;
    private String note;

    public OrderedDetail() {
        this.food = new Food();
        this.order = new Order();
        this.quantity = 0;
        this.note = "";
    }

    public OrderedDetail(Food food, Order order, int quantity, String note) {
        this.food = food;
        this.order = order;
        this.quantity = quantity;
        this.note = note;
    }

    @Override
    public String toString() {
        return "OrderedDetail{" +
                "food=" + food +
                ", order=" + order +
                ", quantity=" + quantity +
                ", note='" + note + '\'' +
                '}';
    }
}
