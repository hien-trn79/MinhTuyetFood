package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "typeaccount")
public class TypeAccount {

    @Id
    @Column(name = "typeId")
    private int typeId;

    @Column(name = "typeName")
    private String typeName;

    public TypeAccount() {
        this.typeId = -1;
        this.typeName = "";
    }

    public TypeAccount(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "TypeAccount{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
