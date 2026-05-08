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
    @GetMapping("/{accountEmail}")
    public Account getAccountByEmail(@PathVariable String accountEmail) {
        return service.findAccountByEmail(accountEmail);
    }

    // [POST] /accounts
    @PostMapping
    public void addAccount(@RequestBody Account newAccount) {
        service.addAccount(newAccount);
    }

    // [PUT] /accounts/:id
    @PutMapping("/{accountEmail}")
    public Account updateAccount(@PathVariable String accountEmail, @RequestBody Account newAccount) {
        Account foundIt = getAccountByEmail(accountEmail);
            return service.updateAccount(newAccount);

    }

    // [DELETE] /accounts/{accountId}
    @DeleteMapping("/{accountEmail}")
    public void deleteAccount(@PathVariable String accountEmail) {
        service.deleteAccount(accountEmail);
    }
}
