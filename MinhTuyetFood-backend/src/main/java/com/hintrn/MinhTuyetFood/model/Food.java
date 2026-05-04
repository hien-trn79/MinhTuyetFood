package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name = "foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tu dong tang ID
    @Column(name = "foodId")
    private Integer foodId;
    @Column(name = "foodName")
    private String foodName;
    @Column(name = "foodPrice")
    private Integer foodPrice;
    @Column(name = "foodImage")
    private String foodImage;

    public Food() {
        this.foodId = 0;
        this.foodName= "";
        this.foodPrice = 0;
        this.foodImage = "";
    }

    public Food(int foodId, String foodName, int price, String foodImage) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPrice = price;
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
        return foodPrice;
    }

    public void setPrice(Integer price) {
        this.foodPrice = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", price=" + foodPrice +
                ", foodImage='" + foodImage + '\'' +
                '}';
    }


}
