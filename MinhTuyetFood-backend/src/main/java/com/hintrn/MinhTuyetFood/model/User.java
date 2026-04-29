package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    private Integer userId;
    private String userName, userSubName;
    private Integer userAge;
    private String userAddress, userNumberphone;

    public User() {
        this.userId = 0;
        this.userName = "";
        this.userSubName = "";
        this.userAge = 1900;
        this.userAddress = "Address";
        this.userNumberphone = "123456789";
    }

    public User(Integer userId, String userName, String userSubName, Integer userAge, String userAddress, String userNumberphone) {
        this.userId = userId;
        this.userName = userName;
        this.userSubName = userSubName;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userNumberphone = userNumberphone;
    }

    public String getStaffAddress() {
        return userAddress;
    }

    public void setStaffAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getStaffAge() {
        return userAge;
    }

    public void setStaffAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getStaffId() {
        return userId;
    }

    public void setStaffId(Integer userId) {
        this.userId = userId;
    }

    public String getStaffName() {
        return userName;
    }

    public void setStaffName(String userName) {
        this.userName = userName;
    }

    public String getStaffNumberphone() {
        return userNumberphone;
    }

    public void setStaffNumberphone(String userNumberphone) {
        this.userNumberphone = userNumberphone;
    }

    public String getStaffSubName() {
        return userSubName;
    }

    public void setStaffSubName(String userSubName) {
        this.userSubName = userSubName;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "userAddress='" + userAddress + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSubName='" + userSubName + '\'' +
                ", userAge=" + userAge +
                ", userNumberphone='" + userNumberphone + '\'' +
                '}';
    }
}
