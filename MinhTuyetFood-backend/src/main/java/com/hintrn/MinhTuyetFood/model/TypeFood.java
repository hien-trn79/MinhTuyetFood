package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity(name = "typeFoods")
public class TypeFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeFoodId;
    private String typeFoodName;

    public TypeFood() {
        this.typeFoodId = -1;
        this.typeFoodName = "";
    }

    public TypeFood(int typeFoodId, String typeFoodName) {
        this.typeFoodId = typeFoodId;
        this.typeFoodName = typeFoodName;
    }

    @Override
    public String toString() {
        return "TypeFood{" +
                "typeFoodId=" + typeFoodId +
                ", typeFoodName='" + typeFoodName + '\'' +
                '}';
    }
}
