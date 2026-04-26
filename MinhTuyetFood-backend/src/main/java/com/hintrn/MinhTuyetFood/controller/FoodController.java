package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.model.Food;
import com.hintrn.MinhTuyetFood.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    FoodService service;

    // [GET] /foods
    @GetMapping("/foods")
    public List<Food> getFoods() {
        return service.getFoods();
    }

    // [GET] /foods/:foodId
    @GetMapping("/foods/{foodId}")
    public Food getFoodById(@PathVariable int foodId) {
        return service.getFoodById(foodId);
    }

    // [POST] /foods
    @PostMapping("/foods")
    public void addFood(@RequestBody Food newFood) {
        service.addFood(newFood);
    }

    // [PUT] /foods/:id
    @PutMapping("/foods")
    public void updateFood(@RequestBody Food newFood) {
        service.updateFood(newFood);
    }

    // [DELETE] /foods/:foodId
    @DeleteMapping("/foods/{foodId}")
    public void deleteFood(@PathVariable int foodId) {
        service.deleteFood(foodId);
    }
}
