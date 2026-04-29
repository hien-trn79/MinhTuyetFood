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
    private String foodImage;

    public Food() {
        this.foodId = 0;
        this.foodName= "";
        this.price = 0;
        this.foodImage = "";
    }

    public Food(int foodId, String foodName, int price, String foodImage) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.foodImage = foodImage;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", price=" + price +
                ", foodImage='" + foodImage + '\'' +
                '}';
    }
}
