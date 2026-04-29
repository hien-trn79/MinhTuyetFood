package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "users")
public class User {

    @Id
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userSubName")
    private String userSubName;
    @Column(name = "userBirth")
    private Integer userAge;
    @Column(name = "userAddress")
    private String userAddress;
    @Column(name = "userNumberphone")
    private String userNumberphone;

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

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumberphone() {
        return userNumberphone;
    }

    public void setUserNumberphone(String userNumberphone) {
        this.userNumberphone = userNumberphone;
    }

    public String getUserSubName() {
        return userSubName;
    }

    public void setUserSubName(String userSubName) {
        this.userSubName = userSubName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userAddress='" + userAddress + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSubName='" + userSubName + '\'' +
                ", userAge=" + userAge +
                ", userNumberphone='" + userNumberphone + '\'' +
                '}';
    }
}
