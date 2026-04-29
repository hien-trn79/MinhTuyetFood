package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
