package com.local.crudprod.controllers;

import com.local.crudprod.model.Product;
import com.local.crudprod.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/products")
    public Product add(@RequestBody Product product) {
        return productService.add(product);
    }

    @PutMapping("/products/{id}")
    public Product update(@RequestBody Product product, @PathVariable long id) {
        return productService.update(product, id);
    }

    @GetMapping("/products/{id}")
    public Optional<Product> findById(@PathVariable long id) {
        return productService.findById(id);
    }

    @DeleteMapping("/products/{id}")
    public void remove(@PathVariable long id) {
        productService.remove(id);
    }
}
