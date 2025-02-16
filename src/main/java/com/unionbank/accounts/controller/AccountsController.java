package com.unionbank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping(value = "hello")
    public String helloWorld(){
        return "Hello Github";
    }
}
