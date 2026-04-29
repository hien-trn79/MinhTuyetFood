package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.model.User;
import com.hintrn.MinhTuyetFood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService service;

    // [GET] /api/users
    @GetMapping
    public List<User> getUsers() {
        return service.getUsers();
    }

    // [POST] /api/users
    @PostMapping
    public void addUser(User newUser) {
        service.addUser(newUser);
    }

    // [GET] /api/user/{userId}
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int userId) {
        return service.getUserById(userId);
    }

    // [PUT] /api/users/{userId}
    @PutMapping("/{userId}")
    public void updateUser(@PathVariable int userId, @RequestBody User newUser) {
        User foundUser = service.getUserById(userId);
        if(foundUser != null) {
            service.updateUser(newUser);
        }
    }

    // [DELETE] /api/users/{userId}
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId) {
        service.deleteUser(userId);
    }
}
