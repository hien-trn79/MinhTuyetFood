package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "typeAccounts")
public class TypeAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeAccountId;
    private String typeAccountName;


    public TypeAccount() {
        this.typeAccountId = -1;
        this.typeAccountName = "";
    }

    @Override
    public String toString() {
        return "TypeAccount{" +
                "typeId=" + typeAccountId +
                ", typeName='" + typeAccountName + '\'' +
                '}';
    }
}
