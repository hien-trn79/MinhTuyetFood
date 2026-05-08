package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
