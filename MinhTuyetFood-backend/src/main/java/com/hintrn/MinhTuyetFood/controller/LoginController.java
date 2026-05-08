package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.DTO.LoginRequest;
import com.hintrn.MinhTuyetFood.DTO.Response;
import com.hintrn.MinhTuyetFood.model.Account;
import com.hintrn.MinhTuyetFood.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    AccountService accountService;

    @PostMapping("/login")
    public Response login(@RequestBody LoginRequest request) {
        Account accountFound = accountService.findAccountByEmail(request.getEmail());
        if(accountFound != null) {
            if(request.getPassword().equals(accountFound.getAccountPassword())) {
                return new Response<Account>(200, accountFound);
            } else {
                return new Response<String>(404, "Not found password");
            }
        } else {
            return new Response<String>(404, "Not Found email");
        }

    }
}
