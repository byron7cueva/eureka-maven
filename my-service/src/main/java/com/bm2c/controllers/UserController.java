package com.bm2c.controllers;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my-service/api/user")
@Lazy
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hola mundo";
    }

}
