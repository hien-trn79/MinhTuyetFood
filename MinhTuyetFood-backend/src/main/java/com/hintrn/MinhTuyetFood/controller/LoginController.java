package com.hintrn.MinhTuyetFood.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class LoginController {

    @RequestMapping(value = "/login", method = GET)
    public String login() {
        return "handle Login Page.....";
    }
}
