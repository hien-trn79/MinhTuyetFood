package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "users")
public class User {

    @Id
    private Integer userId;
    private String userName;
    private String userSubName;
    private Integer userAge;
    private String userAddress;
    private String userNumberPhone;
    private String userImage;


    public User() {
        this.userId = 0;
        this.userName = "";
        this.userSubName = "";
        this.userAge = 1900;
        this.userAddress = "Address";
        this.userNumberPhone = "123456789";
        this.userImage = "";
    }

    public User(Integer userId, String userName, String userSubName, Integer userAge, String userAddress, String userNumberphone, String userImage) {
        this.userId = userId;
        this.userName = userName;
        this.userSubName = userSubName;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userNumberPhone = userNumberphone;
        this.userImage = userImage;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
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
        return userNumberPhone;
    }

    public void setUserNumberphone(String userNumberphone) {
        this.userNumberPhone = userNumberphone;
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
                ", userNumberphone='" + userNumberPhone + '\'' +
                ", userImage='" + userImage + '\'' +
                '}';
    }
}
