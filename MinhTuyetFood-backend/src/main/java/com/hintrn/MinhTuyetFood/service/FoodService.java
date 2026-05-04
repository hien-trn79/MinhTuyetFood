package com.hintrn.MinhTuyetFood.service;

import com.hintrn.MinhTuyetFood.model.Food;
import com.hintrn.MinhTuyetFood.repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    FoodRepo repo;

    // [GET] /foods
    public List<Food> getFoods() {
        return repo.findAll();
    }

    // [GET /foods/:id
    public Food getFoodById(int id) {
        return repo.findById(id).orElse(null);
    }

    // [POST] /foods
    public void addFood(Food newFood) {
        repo.save(newFood);
    }

    // [PUT] /foods/:foodId
    public void updateFood(Food newFood) {
        repo.save(newFood);
    }

    // [DELETE] /foods/:foodId
    public void deleteFood(int foodId) {
        repo.deleteById(foodId);
    }
}
