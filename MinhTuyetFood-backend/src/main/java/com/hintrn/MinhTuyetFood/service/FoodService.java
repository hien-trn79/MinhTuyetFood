package com.hintrn.MinhTuyetFood.service;

import com.hintrn.MinhTuyetFood.model.Food;
import com.hintrn.MinhTuyetFood.repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    FoodRepo repo;

//    List<Food> foods = new ArrayList<>(Arrays.asList(
//            new Food(1, "Mi Xao Gion", 500000),
//            new Food(2, "Hu Tieu Xao", 500000)));

    // [GET] /foods
    public List<Food> getFoods() {
        return repo.findAll();
    }

    // [GET /foods/:id
    public Food getFoodById(int id) {
        return repo.findById(id).orElse(new Food(0, "No food", 0));
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
