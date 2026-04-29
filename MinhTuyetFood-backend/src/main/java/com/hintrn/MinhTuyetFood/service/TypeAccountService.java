package com.hintrn.MinhTuyetFood.service;
import com.hintrn.MinhTuyetFood.model.TypeAccount;
import com.hintrn.MinhTuyetFood.repository.TypeAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeAccountService {
    @Autowired
    TypeAccountRepo repo;

    // [GET] /typeAccounts
    public List<TypeAccount> getTypeAccounts() {
        return repo.findAll();
    }

    // [GET /typeAccounts/:id
    public TypeAccount getTypeAccountById(int id) {
        return repo.findById(id).orElse(null);
    }

    // [POST] /typeAccounts
    public void addTypeAccount(TypeAccount newTypeAccount) {
        repo.save(newTypeAccount);
    }

    // [PUT] /typeAccounts/:foodId
    public void updateTypeAccount(TypeAccount newTypeAccount) {
        repo.save(newTypeAccount);
    }

    // [DELETE] /typeAccounts/:foodId
    public void deleteTypeAccount(int typeAccountId) {
        repo.deleteById(typeAccountId);
    }
}
