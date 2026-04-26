package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends JpaRepository<Food, Integer> {

}
