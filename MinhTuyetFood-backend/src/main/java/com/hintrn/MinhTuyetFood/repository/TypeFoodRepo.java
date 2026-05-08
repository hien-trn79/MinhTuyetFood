package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.TypeFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeFoodRepo extends JpaRepository<TypeFood, Integer> {
}
