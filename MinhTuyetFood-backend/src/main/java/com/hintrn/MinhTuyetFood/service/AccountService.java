package com.hintrn.MinhTuyetFood.service;

import com.hintrn.MinhTuyetFood.model.Account;
import com.hintrn.MinhTuyetFood.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepo repo;

    // [GET] /accounts
    public List<Account> getAccounts() {
        return repo.findAll();
    }

    // [GET /accounts/{accountEmail}
    public Account findAccountByEmail(String accountEmail) {
        return repo.findByEmail(accountEmail);
    }

    // [POST] /accounts
    public void addAccount(Account newAccount) {
        repo.save(newAccount);
    }

    // [PUT] /accounts/{accountId}
    public void updateAccount(Account newAccount) {
        repo.save(newAccount);
    }

    // [DELETE] /accounts/{accountId}
    public void deleteAccount(int accountId) {
        repo.deleteById(accountId);
    }
}
