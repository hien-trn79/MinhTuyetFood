package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.DTO.LoginRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        System.out.println(request.getEmail());
        System.out.println(request.getPassword());
        return request.toString();
    }
}
