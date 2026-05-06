package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.model.TypeFood;
import com.hintrn.MinhTuyetFood.service.TypeFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/typefoods")
public class TypeFoodController {


    @Autowired
    TypeFoodService service;

    // [GET] /api/typefoods
    @GetMapping
    public List<TypeFood> getTypeFoods() {return service.getTypeFoods();};

    // [POST] /api/typefoods
    @PostMapping
    public void addTypeFood(@RequestBody TypeFood newType) {
        service.addTypeFood(newType);
    }

    // [PUT] /api/typefoods/{typeId}
    @PutMapping
    public void updateTypeFood(@PathVariable int typeId,@RequestBody TypeFood newType) {
        TypeFood typeFound = getTypeFoodById(typeId);
        if(typeFound != null) {
            service.updateTypeFood(newType);
        }
    }

    @DeleteMapping
    // [DELETE] /api/typefoods
    public void deleteTypeFood(@PathVariable int typeId) {
        service.deleteTypeFood(typeId);
    }

    @GetMapping("/{typeId}")
    // [GET] api/typefoods/{typeId}
    public TypeFood getTypeFoodById(@PathVariable int typeId) {
        return service.getTypeFoodById(typeId);
    }
}
