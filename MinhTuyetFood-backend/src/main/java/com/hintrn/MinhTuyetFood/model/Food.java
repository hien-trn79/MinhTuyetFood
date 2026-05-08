package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Entity (name = "foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tu dong tang ID
    private Integer foodId;
    private String foodName;
    private String foodDescription;
    private Integer foodPrice;
    private String foodImage;

    public Food() {
        this.foodId = -1;
        this.foodName = "";
        this.foodDescription = "";
        this.foodPrice = 0;
        this.foodImage = "";
    }

    public Food(Integer foodId, String foodName, String foodDescription, Integer foodPrice, String foodImage) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodImage = foodImage;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", foodDescription='" + foodDescription + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodImage='" + foodImage + '\'' +
                '}';
    }
}
