package com.hintrn.MinhTuyetFood.service;

import com.hintrn.MinhTuyetFood.model.TypeFood;
import com.hintrn.MinhTuyetFood.repository.TypeFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeFoodService {

    @Autowired
    TypeFoodRepo repo;

    // [GET] /api/typefoods
    public List<TypeFood> getTypeFoods() {return repo.findAll();};

    // [POST] /api/typefoods
    public void addTypeFood(TypeFood newType) {
        repo.save(newType);
    }

    // [PUT] /api/typefoods/{typeId}
    public void updateTypeFood(TypeFood newType) {
        repo.save(newType);
    }

    // [DELETE] /api/typefoods
    public void deleteTypeFood(int typeId) {
        repo.deleteById(typeId);
    }

    // [GET] api/typefoods/{typeId}
    public TypeFood getTypeFoodById(int typeId) {
        return repo.findById(typeId).orElse(null);
    }
}
