package com.bm2c.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/my-service/api/product")
public class ProductController {
    @GetMapping()
    public String getProducts() {
        return "Product";
    }
}
