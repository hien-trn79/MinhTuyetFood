package com.hintrn.MinhTuyetFood.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Homepage Minh tuyet food";
    }

    @RequestMapping("/about")
    public String introduce() {
        return "this is a perfect restaurant abotu food. Address: Sa dec City, Dong Thap Province";
    }
}
