package com.hintrn.MinhTuyetFood.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "accounts")
public class Account {

    @Id
    private String accountEmail;
    private String accountPassword;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "typeAccountId")
    private TypeAccount typeAccount;

    public Account() {
        this.accountEmail = "";
        this.accountPassword = "";
        this.typeAccount = new TypeAccount();
        this.user = new User();
    }

    public Account(String accountEmail, String accountPassword, TypeAccount typeAccount, User user) {
        this.accountEmail = accountEmail;
        this.accountPassword = accountPassword;
        this.typeAccount = typeAccount;
        this.user = user;
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

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(TypeAccount typeAccount) {
        this.typeAccount = typeAccount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountEmail='" + accountEmail + '\'' +
                ", accountPassword='" + accountPassword + '\'' +
                ", user=" + user +
                ", typeAccount=" + typeAccount +
                '}';
    }
}
