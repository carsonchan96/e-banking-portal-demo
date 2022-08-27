package com.example.eBankingPortal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class UserController {
    @RequestMapping({"/hello"})
    public String firstPage(){
        return "Hello world 123";
    }
}
