package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.model.TypeAccount;
import com.hintrn.MinhTuyetFood.service.TypeAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/typeAccounts")
public class TypeAccountController {

    @Autowired
    TypeAccountService service;
    // [GET] /typeAccounts
    @GetMapping
    public List<TypeAccount> getTypeAccounts() {
        return service.getTypeAccounts();
    }

    // [GET] /typeAccounts/:foodId
    @GetMapping("/{typeAccountId}")
    public TypeAccount getTypeAccountById(@PathVariable int typeAccountId) {
        return service.getTypeAccountById(typeAccountId);
    }

    // [POST] /typeAccounts
    @PostMapping
    public void addTypeAccount(@RequestBody TypeAccount newTypeAccount) {
        service.addTypeAccount(newTypeAccount);
    }

    // [PUT] /typeAccounts/:id
    @PutMapping
    public void updateTypeAccount(@RequestBody TypeAccount newTypeAccount) {
        service.updateTypeAccount(newTypeAccount);
    }

    // [DELETE] /typeAccounts/:typeAccountId
    @DeleteMapping("/{typeAccountId}")
    public void deleteTypeAccount(@PathVariable int typeAccountId) {
        service.deleteTypeAccount(typeAccountId);
    }
}
