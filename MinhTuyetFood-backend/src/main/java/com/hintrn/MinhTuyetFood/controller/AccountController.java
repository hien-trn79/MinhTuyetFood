package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.model.Account;
import com.hintrn.MinhTuyetFood.model.Food;
import com.hintrn.MinhTuyetFood.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    AccountService service;

    // [GET] /accounts
    @GetMapping
    public List<Account> getAccounts() {
        return service.getAccounts();
    }

    // [GET] /accounts/{accountId}
    @GetMapping("/{accountId}")
    public Account getAccountById(@PathVariable int accountId) {
        return service.getAccountById(accountId);
    }

    // [POST] /accounts
    @PostMapping
    public void addAccount(@RequestBody Account newAccount) {
        service.addAccount(newAccount);
    }

    // [PUT] /accounts/:id
    @PutMapping
    public void updateAccount(@RequestBody Account newAccount) {
        service.updateAccount(newAccount);
    }

    // [DELETE] /accounts/{accountId}
    @DeleteMapping("/{accountId}")
    public void deleteAccount(@PathVariable int accountId) {
        service.deleteAccount(accountId);
    }
}
