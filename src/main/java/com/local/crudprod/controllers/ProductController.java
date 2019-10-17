package com.local.crudprod.controllers;

import com.local.crudprod.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("/")
    public Product index() {
        return new Product("product1", "description", 150d);
    }
}
