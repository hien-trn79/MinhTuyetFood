package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
public class Food {

    @Id
    private Integer foodId;
    private String foodName;
    private Integer price;

    public Food() {
        this.foodId = 0;
        this.foodName= "";
        this.price = 0;
    }

    public Food(int foodId, String foodName, int price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", price=" + price +
                '}';
    }
}
