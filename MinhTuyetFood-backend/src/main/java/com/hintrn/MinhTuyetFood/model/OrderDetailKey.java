package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OrderDetailKey implements Serializable {

    private int orderId;
    private int foodId;
    private int typeFoodId;

    public boolean equals(Object o) {
        if(this == o) return  true;
        if(o == null || getClass() != o.getClass()) return false;
        OrderDetailKey that = (OrderDetailKey) o;
        return Objects.equals(foodId, that.foodId) && Objects.equals(orderId, that.orderId);
    }

    public int hashCode() {
        return Objects.hash(foodId, orderId, typeFoodId);
    }
}
