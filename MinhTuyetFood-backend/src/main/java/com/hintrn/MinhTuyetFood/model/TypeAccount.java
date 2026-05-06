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
    @Column(name = "typeName")
    private String typeAccountName;


    public TypeAccount() {
        this.typeAccountId = -1;
        this.typeAccountName = "";
    }

    public TypeAccount(int typeId, String typeName) {
        this.typeAccountId = typeId;
        this.typeAccountName = typeName;
    }

    public int getTypeId() {
        return typeAccountId;
    }

    public void setTypeId(int typeId) {
        this.typeAccountId = typeId;
    }

    public String getTypeName() {
        return typeAccountName;
    }

    public void setTypeName(String typeName) {
        this.typeAccountName = typeName;
    }

    @Override
    public String toString() {
        return "TypeAccount{" +
                "typeId=" + typeAccountId +
                ", typeName='" + typeAccountName + '\'' +
                '}';
    }
}
