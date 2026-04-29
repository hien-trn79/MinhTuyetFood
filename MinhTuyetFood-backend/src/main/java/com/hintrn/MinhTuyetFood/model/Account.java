package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "accounts")
public class Account {

    @Id
    @Column(name = "accountEmail")
    private String accountEmail;
    @Column(name = "accountPassword")
    private String accountPassword;
    @Column(name = "userID")
    private int userID;
    @Column(name = "typeAccount")
    private int typeAccount;

    public Account() {
        this.accountEmail = "";
        this.accountPassword = "";
        this.userID = -1;
        this.typeAccount = -1;
    }

    public Account(String accountEmail, String accountPassword, int typeAccount, int userID) {
        this.accountEmail = accountEmail;
        this.accountPassword = accountPassword;
        this.typeAccount = typeAccount;
        this.userID = userID;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public int getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(int typeAccount) {
        this.typeAccount = typeAccount;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountEmail='" + accountEmail + '\'' +
                ", accountPassword='" + accountPassword + '\'' +
                ", userID=" + userID +
                ", typeAccount=" + typeAccount +
                '}';
    }
}
