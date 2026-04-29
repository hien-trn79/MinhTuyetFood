package com.hintrn.MinhTuyetFood.service;

import com.hintrn.MinhTuyetFood.model.User;
import com.hintrn.MinhTuyetFood.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    // [GET] /api/user
    public List<User> getUsers() {
        return repo.findAll();
    }

    // [POST] /api/staffs
    public void addUser(User newUser) {
        repo.save(newUser);
    }

    // [GET] /api/{userId}
    public User getUserById(int userId) {
        return repo.findById(userId).orElse(null);
    }

    // [PUT] /api/staffs/{staffId}
    public void updateUser(User newUser) {
        repo.save(newUser);
    }

    // [DELETE] /api/staffs/{userId}
    public void deleteUser(int id) {
        repo.deleteById(id);
    }
}
